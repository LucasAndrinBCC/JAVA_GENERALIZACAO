package com.veiculo;

public class Caminhao extends Veiculo {
	
	private int eixos;
	
	Caminhao(boolean motor, int eixos) {
		super(motor);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Caminhao [getEixos()=");
		builder.append(getEixos());
		builder.append("]");
		return builder.toString();
	}
	
}
