package com.pessoa;

public class Pessoa {

	private String nome;
	
	private String endereco;
	
	public Pessoa(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [getNome()=");
		builder.append(getNome());
		builder.append(", getEndereco()=");
		builder.append(getEndereco());
		builder.append("]");
		return builder.toString();
	}
}
