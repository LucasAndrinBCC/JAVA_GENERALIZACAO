package com.veiculo;

public class Carro extends Veiculo {
	
	private int portas;
	
	Carro(boolean motor, int portas) {
		super(motor);
		setPortas(portas);
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Carro [getPortas()=");
		builder.append(getPortas());
		builder.append("]");
		return builder.toString();
	}
	
	
}
