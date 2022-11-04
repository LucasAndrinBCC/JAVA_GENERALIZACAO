package com.musica;

public class Violao extends Cordas {
	
	private boolean possuiPalheta;

	public Violao(String tipoInstrumento, String tipoCorda, boolean possuiPalheta) {
		super(tipoInstrumento, tipoCorda);
		setPossuiPalheta(possuiPalheta);
	}

	public boolean isPossuiPalheta() {
		return possuiPalheta;
	}

	public void setPossuiPalheta(boolean possuiPalheta) {
		this.possuiPalheta = possuiPalheta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Violao [isPossuiPalheta()=");
		builder.append(isPossuiPalheta());
		builder.append("]");
		return builder.toString();
	}
}
