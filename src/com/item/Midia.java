package com.item;

public class Midia extends Item {
	
	private String gravadora;
	
	private float duracao;
	
	Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Midia [getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getDuracao()=");
		builder.append(getDuracao());
		builder.append("]");
		return builder.toString();
	}
	
	
}
