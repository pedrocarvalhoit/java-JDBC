package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.lojaVirtual.factory.ConnectionFactory;
import com.jdbc.treinoDeForca.dao.ClienteDAO;
import com.jdbc.treinoDeForca.modelo.Cliente;

public class Teste {

	public static void main(String[] args) throws SQLException {
		
		Cliente ronaldinho = new Cliente(99998, "Ronaldinho Gaucho", "Santa", 53, "M", "Avançado");
		
		com.jdbc.treinoDeForca.factory.ConnectionFactory factory = new com.jdbc.treinoDeForca.factory.ConnectionFactory();
		Connection con = factory.recuperarConexao();
		
		ClienteDAO clienteDao = new ClienteDAO(con);
		clienteDao.salvar(ronaldinho);
		
		List<Cliente> listaCliente = clienteDao.listar();
		listaCliente.stream()
			.forEach(c -> System.out.println(c));
		
		
	}
	
}
