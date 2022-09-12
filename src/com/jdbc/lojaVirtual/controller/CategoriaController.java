package com.jdbc.lojaVirtual.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.lojaVirtual.dao.CategoriaDAO;
import com.jdbc.lojaVirtual.factory.ConnectionFactory;
import com.jdbc.lojaVirtual.modelo.Categoria;

public class CategoriaController  {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() throws SQLException {
		return this.categoriaDAO.listar();
	}
}
