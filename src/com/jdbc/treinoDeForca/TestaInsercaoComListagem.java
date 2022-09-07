package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.jdbc.treinoDeForca.dao.ClienteDAO;
import com.jdbc.treinoDeForca.modelo.Cliente;

public class TestaInsercaoComListagem {
	
	public static void main(String[] args) throws SQLException {

		Cliente daniel = new Cliente(42424, "Daniel Borges", "Cassia", 29, "M", "advanced");
		
		try(Connection con = new ConnectionFactory().recuperarConexao()){
			ClienteDAO clienteDAO = new ClienteDAO(con);
			clienteDAO.salvar(daniel);
			List<Cliente> listaClientes = clienteDAO.listar();
			listaClientes.stream()
				.forEach(c -> System.out.println(c));
		}
		
		
	}

}
