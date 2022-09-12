package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.treinoDeForca.factory.ConnectionFactory;

public class TesteAlteracao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("UPDATE TBCLIENT SET ACTIVITY_LEVEL = 'medium' WHERE CPF = 33335");
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Linhas modificadas: " + linhasModificadas);
		
		con.close();

	}

}
