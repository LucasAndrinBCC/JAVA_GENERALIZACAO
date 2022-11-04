package com.musica;

public class Cordas extends InstrumentoMusical {
	
	private String tipoCorda;
	
	public Cordas(String tipoInstrumento, String tipoCorda) {
		super(tipoInstrumento);
		setTipoCorda(tipoCorda);
	}

	public String getTipoCorda() {
		return tipoCorda;
	}

	public void setTipoCorda(String tipoCorda) {
		this.tipoCorda = tipoCorda;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Cordas [getTipoCorda()=");
		builder.append(getTipoCorda());
		builder.append("]");
		return builder.toString();
	}
}
