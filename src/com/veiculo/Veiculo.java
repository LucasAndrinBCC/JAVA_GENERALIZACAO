package com.veiculo;

public class Veiculo {
	
	private boolean motor;

	Veiculo(boolean motor) {
		setMotor(motor);
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [isMotor()=");
		builder.append(isMotor());
		builder.append("]");
		return builder.toString();
	}
}
