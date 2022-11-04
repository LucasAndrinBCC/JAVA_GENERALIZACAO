package com.simples;

public class ContaEspecial {
	
	private int diasSemJuros;
	
	private double limite;

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ContaEspecial [getDiasSemJuros()=");
		builder.append(getDiasSemJuros());
		builder.append(", getLimite()=");
		builder.append(getLimite());
		builder.append("]");
		return builder.toString();
	}
	
}
