package com.jdbcPedro.lojaVirtual;

import java.sql.SQLException;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFactory = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
			conFactory.recuperarConexao();
			System.out.println("Conex�o de n�mero: " + i );
		}
		
	}
	
}
