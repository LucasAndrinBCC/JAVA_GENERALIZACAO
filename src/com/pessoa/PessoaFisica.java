package com.pessoa;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PessoaFisica [getCpf()=");
		builder.append(getCpf());
		builder.append(", getEstadoCivil()=");
		builder.append(getEstadoCivil());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
