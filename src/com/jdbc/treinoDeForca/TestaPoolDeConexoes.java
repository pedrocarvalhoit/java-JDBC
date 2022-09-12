package com.jdbc.treinoDeForca;

import java.sql.SQLException;

import com.jdbc.treinoDeForca.factory.ConnectionFactory;

public class TestaPoolDeConexoes {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory con = new ConnectionFactory();
		
		for (int i = 0; i < 18;i++) {
			con.recuperarConexao();
			System.out.println("Conexão número: " + i);
		}
		
	}

}
