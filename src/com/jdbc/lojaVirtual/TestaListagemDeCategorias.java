package com.jdbc.lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.lojaVirtual.dao.CategoriaDAO;
import com.jdbc.lojaVirtual.dao.ProdutoDAO;
import com.jdbc.lojaVirtual.factory.ConnectionFactory;
import com.jdbc.lojaVirtual.modelo.Categoria;
import com.jdbc.lojaVirtual.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);	
			List<Categoria> listaDeCategorias = categoriaDAO.listarComProdutos();
			listaDeCategorias.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				for(Produto produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}
			});
		}

	}

}
