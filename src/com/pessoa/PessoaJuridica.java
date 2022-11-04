package com.pessoa;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	private String tipoEmpresa;
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PessoaJuridica [getCnpj()=");
		builder.append(getCnpj());
		builder.append(", getTipoEmpresa()=");
		builder.append(getTipoEmpresa());
		builder.append("]");
		return builder.toString();
	}
}
