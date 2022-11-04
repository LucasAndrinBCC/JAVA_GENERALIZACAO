package com.navaespacial;

public class Apolo11 extends NaveEspacial {
	
	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public Apolo11(double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima);
		setTipoCombustivel(tipoCombustivel);
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Apolo11 [getTipoCombustivel()=");
		builder.append(getTipoCombustivel());
		builder.append("]");
		return builder.toString();
	}
	
}
