package com.xadrez;

public class Peao extends Peca {

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public boolean mover(int linha, int coluna) {
		int linhaAtual = getLinha();
		int colunaAtual = getColuna();
		if (linha - 1 != linhaAtual && (coluna + 1 != colunaAtual && coluna - 1 != colunaAtual)) {
			return false;
		}
		setLinha(linha);
		setColuna(coluna);
		return true;
	}
	
}
