package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.criarConexao();
		
		PreparedStatement stm = con.prepareStatement("SELECT * FROM TBCLIENT");
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			String cpf = rst.getString("CPF");
			String nome = rst.getString("NAME_CLIENT");
			String cidade = rst.getString("CITY");
			Integer idade = rst.getInt("AGE");
			String genero = rst.getString("GENDER");
			String nivelAtividade = rst.getString("ACTIVITY_LEVEL");
			System.out.println("CPF: " + cpf + ", NOME: " + nome);
			System.out.println("NASCIDO EM: " + cidade + ", IDADE: " + idade);
			System.out.println("GENERO: " + genero +", NÍVEL: " + nivelAtividade);
			System.out.println("-----------------------------------------");
		}
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Linhas modificadas: " + linhasModificadas);
		
		con.close();

	}

}
