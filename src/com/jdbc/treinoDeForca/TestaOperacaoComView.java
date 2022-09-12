package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;

import com.jdbc.lojaVirtual.view.ProdutoCategoriaFrame;
import com.jdbc.treinoDeForca.factory.ConnectionFactory;

public class TestaOperacaoComView {

	public static void main(String[] args) throws SQLException {

		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
