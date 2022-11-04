package com.musica;

public class Tambor extends Percurssao {

	private boolean palitos;
	
	public Tambor(String tipoInstrumento, String tipoSom, boolean palitos) {
		super(tipoInstrumento, tipoSom);
		setPalitos(palitos);
	}

	public boolean isPalitos() {
		return palitos;
	}

	public void setPalitos(boolean palitos) {
		this.palitos = palitos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Tambor [isPalitos()=");
		builder.append(isPalitos());
		builder.append("]");
		return builder.toString();
	}
}
