package com.bomba.combustivel;

public class Bomba {
	
	private double totalLitros;
	
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		setTotalLitros(totalLitros);
		setValorLitro(valorLitro);
	}

	public double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public boolean abastecerPorLitro(int litros) {
		double totalLitros = getTotalLitros();
		if (totalLitros < litros) {
			return false;
		}
		setTotalLitros(totalLitros - litros);
		return true;
	}
	
	public boolean abastecerPorValor(double valor) {
		double totalLitros = getTotalLitros();
		double litros = (float) valor / getValorLitro();
		if (totalLitros < litros) {
			return false;
		}
		setTotalLitros(totalLitros - litros);
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [getTotalLitros()=");
		builder.append(getTotalLitros());
		builder.append(", getValorLitro()=");
		builder.append(getValorLitro());
		builder.append("]");
		return builder.toString();
	}
	
}
