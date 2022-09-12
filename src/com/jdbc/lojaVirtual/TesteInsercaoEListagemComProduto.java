package com.jdbc.lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.jdbc.lojaVirtual.dao.ProdutoDAO;
import com.jdbc.lojaVirtual.factory.ConnectionFactory;
import com.jdbc.lojaVirtual.modelo.Produto;

public class TesteInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Arm�rio", "C�moda Vertical");

		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(con);
			produtoDAO.salvar(comoda);
			List<Produto> listaDeProdutos = produtoDAO.listar();
			listaDeProdutos.stream()
				.forEach(p -> System.out.println(p));
		}

	}

}
 