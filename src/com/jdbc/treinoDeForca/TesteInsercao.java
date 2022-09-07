package com.jdbc.treinoDeForca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao {

	public static void main(String[] args) throws SQLException {
	
		int cpf = 11116;
		String nome = "Rafael Nadal";
		String cidade = "Barcelona";
		int idade = 35;
		String genero = "M";
		String nivelAtividade = "advanced ";
		
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.criarConexao();
		
		PreparedStatement stm = con.prepareStatement("INSERT INTO TBCLIENT (CPF, NAME_CLIENT, CITY, AGE, GENDER, ACTIVITY_LEVEL)"
				+ "VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
		stm.setInt(1, cpf);
		stm.setString(2, nome);
		stm.setString(3, cidade);
		stm.setInt(4	, idade);
		stm.setString(5, genero);
		stm.setString(6, nivelAtividade);
		
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()){
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Linhas modificadas: " + linhasModificadas);
		
		con.close();
	}

}
