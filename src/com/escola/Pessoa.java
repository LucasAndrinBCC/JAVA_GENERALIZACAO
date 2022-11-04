package com.escola;

public class Pessoa {
	
	private int codigo;
	
	private String nome;
	
	private String endereco;
	
	public Pessoa(int codigo, String nome, String endereco) {
		setCodigo(codigo);
		setNome(nome);
		setEndereco(endereco);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		builder.append("Pessoa [getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndereco()=");
		builder.append(getEndereco());
		builder.append("]");
		return builder.toString();
	}
}
