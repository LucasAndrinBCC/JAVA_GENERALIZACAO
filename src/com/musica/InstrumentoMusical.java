package com.musica;

public class InstrumentoMusical {
	
	private String tipoInstrumento;
	
	private String nome;
	
	InstrumentoMusical(String tipoInstrumento) {
		setTipoInstrumento(tipoInstrumento);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstrumentoMusical [getNome()=");
		builder.append(getNome());
		builder.append(", getTipoInstrumento()=");
		builder.append(getTipoInstrumento());
		builder.append("]");
		return builder.toString();
	}
}
