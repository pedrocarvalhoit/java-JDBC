package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection criarConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/strengthtraining?useTimezone=true&serverTimezone=UTC", "root", "Ph1478963+");
		
	}

}
