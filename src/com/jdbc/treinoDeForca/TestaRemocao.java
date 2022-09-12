package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.treinoDeForca.factory.ConnectionFactory;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		int cpf = 42424;
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("DELETE FROM TBCLIENT WHERE CPF = ?");
		stm.setInt(1, cpf);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Linhas modificadas: " + linhasModificadas);		
		con.close();

	}

}
