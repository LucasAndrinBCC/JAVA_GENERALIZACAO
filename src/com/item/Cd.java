package com.item;

public class Cd extends Midia {
	
	private int faixas;
	
	private String artistas;
	
	private String album;

	private Cd(int codigo, String descricao, String gravadora, float duracao, int faixas, String artistas, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixas(faixas);
		setArtistas(artistas);
		setAlbum(album);
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtistas() {
		return artistas;
	}

	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Cd [getFaixas()=");
		builder.append(getFaixas());
		builder.append(", getArtistas()=");
		builder.append(getArtistas());
		builder.append(", getAlbum()=");
		builder.append(getAlbum());
		builder.append("]");
		return builder.toString();
	}

}
