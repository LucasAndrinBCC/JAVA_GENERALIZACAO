package com.musica;

public class Percurssao extends InstrumentoMusical {
	
	private String tipoSom;

	public Percurssao(String tipoInstrumento, String tipoSom) {
		super(tipoInstrumento);
		setTipoSom(tipoSom);
	}

	public String getTipoSom() {
		return tipoSom;
	}

	public void setTipoSom(String tipoSom) {
		this.tipoSom = tipoSom;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Percurssao [getTipoSom()=");
		builder.append(getTipoSom());
		builder.append("]");
		return builder.toString();
	}
}
