package com.animal;

public class Cachorro extends Mamifero {
	
	private String cor;
	
	private String alimentacao;
	
	Cachorro(
			String reino, String filo, 
			String classe, String ordem, 
			String familia, String nome, 
			String genero, String especie,
			String sexo, String cor,
			String alimentacao
	) {
		super(reino, filo, classe, ordem, familia, nome, genero, especie, sexo);
		setCor(cor);
		setAlimentacao(alimentacao);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public String latir() {
		return "Auau";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Cachorro [getCor()=");
		builder.append(getCor());
		builder.append(", getAlimentacao()=");
		builder.append(getAlimentacao());
		builder.append("]");
		return builder.toString();
	}
}
