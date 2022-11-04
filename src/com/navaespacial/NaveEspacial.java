package com.navaespacial;

public class NaveEspacial {
	
	private double velocidadeMaxima;

	public NaveEspacial(double velocidadeMaxima) {
		super();
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveEspacial [getVelocidadeMaxima()=");
		builder.append(getVelocidadeMaxima());
		builder.append("]");
		return builder.toString();
	}
	
}
