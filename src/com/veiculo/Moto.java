package com.veiculo;

public class Moto extends Veiculo {
	
	private int cilindradas;
	
	Moto(boolean motor, int cilindradas) {
		super(motor);
		setCilindradas(cilindradas);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Moto [getCilindradas()=");
		builder.append(getCilindradas());
		builder.append("]");
		return builder.toString();
	}
	
}
