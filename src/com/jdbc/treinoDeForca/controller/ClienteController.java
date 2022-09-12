package com.jdbc.treinoDeForca.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.jdbc.treinoDeForca.dao.ClienteDAO;
import com.jdbc.treinoDeForca.factory.ConnectionFactory;

public class ClienteController {
	
	private ClienteDAO clienteDAO;
	
	public ClienteController() throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.clienteDAO = new ClienteDAO(connection);
	}

}
