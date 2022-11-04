package com.musica;

public class Piano extends Cordas {
	
	private String modeloPiano;

	public Piano(String tipoInstrumento, String tipoCorda, String modeloPiano) {
		super(tipoInstrumento, tipoCorda);
		setModeloPiano(modeloPiano);
	}

	public String getModeloPiano() {
		return modeloPiano;
	}

	public void setModeloPiano(String modeloPiano) {
		this.modeloPiano = modeloPiano;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Piano [getModeloPiano()=");
		builder.append(getModeloPiano());
		builder.append("]");
		return builder.toString();
	}
}
