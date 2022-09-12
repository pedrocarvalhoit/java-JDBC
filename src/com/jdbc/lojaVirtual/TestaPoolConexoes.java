package com.jdbc.lojaVirtual;

import java.sql.SQLException;

import com.jdbc.lojaVirtual.factory.ConnectionFactory;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFactory = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
			conFactory.recuperarConexao();
			System.out.println("Conexão de número: " + i );
		}
		
	}
	
}
