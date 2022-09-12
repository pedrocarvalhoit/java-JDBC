package com.jdbc.lojaVirtual;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbc.lojaVirtual.factory.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection con = criaConexao.recuperarConexao();
		
		System.out.println("Encerrando conexão");
		
		con.close();
	}

}
