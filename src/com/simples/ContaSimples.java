package com.simples;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ContaSimples [getSaldoPoupanca()=");
		builder.append(getSaldoPoupanca());
		builder.append("]");
		return builder.toString();
	}

}
