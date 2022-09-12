package com.jdbc.lojaVirtual.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.lojaVirtual.dao.ProdutoDAO;
import com.jdbc.lojaVirtual.factory.ConnectionFactory;
import com.jdbc.lojaVirtual.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) throws SQLException {
		this.produtoDAO.salvar(produto);
	}

	public List<Produto> listar() throws SQLException {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
