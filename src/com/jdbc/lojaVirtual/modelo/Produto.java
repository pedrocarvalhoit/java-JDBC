package com.jdbc.lojaVirtual.modelo;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private Integer categoriaId;

	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public Produto(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	@Override
	public String toString() {
		return String.format("O produto é: %d, %s, %s", this.id, this.nome, this.descricao);
	}

}
