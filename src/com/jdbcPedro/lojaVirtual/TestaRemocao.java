package com.jdbcPedro.lojaVirtual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao{

	public static void main(String[] args) throws SQLException {

		int id = 8;
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID = ?");
		stm.setInt(1, id);
		stm.execute();
		
		// Contando as linhas modificadas
		Integer linhasModificadas = stm.getUpdateCount();

		System.out.println("Quantidade de linhas exclu�das: " + linhasModificadas);

		con.close();

	}

}