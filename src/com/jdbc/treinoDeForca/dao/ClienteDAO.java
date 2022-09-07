package com.jdbc.treinoDeForca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.treinoDeForca.modelo.Cliente;

public class ClienteDAO {
	
	private Connection connection;

	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void salvar (Cliente cliente) throws SQLException {
		String sql = "INSERT INTO TBCLIENT (CPF, NAME_CLIENT, CITY, AGE, GENDER, ACTIVITY_LEVEL)VALUES (?, ?, ?, ?, ?, ?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setInt(1, cliente.getCpf());
			pstm.setString(2, cliente.getNome());
			pstm.setString(3, cliente.getCidade());
			pstm.setInt(4	, cliente.getIdade());
			pstm.setString(5, cliente.getGenero());
			pstm.setString(6, cliente.getNivelAtividade());
			
			pstm.execute();
			
		}
	}

	public List<Cliente> listar() throws SQLException{
		List<Cliente> clientes = new ArrayList<>();
		
		String sql = "SELECT * FROM TBCLIENT";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
				Cliente cliente = new Cliente(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getString(5), rst.getString(6));
				
				clientes.add(cliente);
				}
			}
		}
		return clientes;
	}
	
}
