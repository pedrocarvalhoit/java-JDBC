package com.jdbc.treinoDeForca.modelo;

public class Cliente {
	
	private int cpf;
	private String nome;
	private String cidade;
	private int idade;
	private String genero;
	private String nivelAtividade;
	
	public Cliente(int cpf, String nome, String cidade, int idade, String genero, String nivelAtividade) {
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
		this.genero = genero;
		this.nivelAtividade = nivelAtividade;
	}

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public int getIdade() {
		return idade;
	}

	public String getGenero() {
		return genero;
	}

	public String getNivelAtividade() {
		return nivelAtividade;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + this.nome;
	}
	
	

}
