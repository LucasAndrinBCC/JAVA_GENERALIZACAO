package com.xadrez;

public class Peca {
	
	private int linha;
	
	private int coluna;
	
	private boolean cor;
	
	private int movimentos;
	
	public Peca(int linha, int coluna, boolean cor, int movimentos) {
		setLinha(linha);
		setColuna(coluna);
		setCor(cor);
		setMovimentos(movimentos);
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public boolean isCor() {
		return cor;
	}

	public void setCor(boolean cor) {
		this.cor = cor;
	}

	public int getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(int movimentos) {
		this.movimentos = movimentos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peca [getLinha()=");
		builder.append(getLinha());
		builder.append(", getColuna()=");
		builder.append(getColuna());
		builder.append(", isCor()=");
		builder.append(isCor());
		builder.append(", getMovimentos()=");
		builder.append(getMovimentos());
		builder.append("]");
		return builder.toString();
	}
	
}
