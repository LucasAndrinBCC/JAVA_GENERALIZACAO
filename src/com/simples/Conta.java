package com.simples;

public class Conta {
	
	private String banco;
	
	private int agencia;
	
	private int numeroConta;
	
	private double saldo;
	
	Conta(String banco, int agencia, int numeroConta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito(double valor) {
		setSaldo(getSaldo() + valor);
		
		return true;
	}
	
	public boolean saque(double valor) {
		double saldo = getSaldo();
		
		if (saldo < valor) {
			return false;
		}
		
		setSaldo(saldo - valor);
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroConta()=");
		builder.append(getNumeroConta());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append("]");
		return builder.toString();
	}

}
