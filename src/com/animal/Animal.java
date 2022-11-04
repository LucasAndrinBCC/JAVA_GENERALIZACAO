package com.animal;

public class Animal {

	private String reino;
	
	private String filo;
	
	private String classe;
	
	private String ordem;
	
	private String familia;
	
	private String nome;
	
	private String genero;

	private String especie;
	
	public Animal(
			String reino, String filo,
			String classe, String ordem,
			String familia, String nome,
			String genero, String especie
	) {
		this.reino = reino;
		this.filo = filo;
		this.classe = classe;
		this.ordem = ordem;
		this.familia = familia;
		this.nome = nome;
		this.genero = genero;
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [getEspecie()=");
		builder.append(getEspecie());
		builder.append(", getReino()=");
		builder.append(getReino());
		builder.append(", getFilo()=");
		builder.append(getFilo());
		builder.append(", getClasse()=");
		builder.append(getClasse());
		builder.append(", getOrdem()=");
		builder.append(getOrdem());
		builder.append(", getFamilia()=");
		builder.append(getFamilia());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getGenero()=");
		builder.append(getGenero());
		builder.append("]");
		return builder.toString();
	}
}
