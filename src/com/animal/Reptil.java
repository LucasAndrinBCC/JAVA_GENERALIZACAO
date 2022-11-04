package com.animal;

public class Reptil extends Animal {
	
	
	private String sexo;

	Reptil(
			String reino, String filo, 
			String classe, String ordem, 
			String familia, String nome, 
			String genero, String especie,
			String tipoReproducao, String sexo
	) {
		super(reino, filo, classe, ordem, familia, nome, genero, especie);
		setSexo(sexo);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public boolean colocarOvo() {
		return getSexo().toLowerCase().equals("feminino");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Reptil [");
		builder.append(", getSexo()=");
		builder.append(getSexo());
		builder.append("]");
		return builder.toString();
	}
}
