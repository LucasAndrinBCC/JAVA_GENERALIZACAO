package com.xadrez;

public class Torre extends Peca {

	public Torre(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public boolean mover(int linha, int coluna) {
		int linhaAtual = getLinha();
		int colunaAtual = getColuna();
		if (linha == linhaAtual && coluna != colunaAtual || linha != linhaAtual && coluna == colunaAtual) {
			setLinha(linha);
			setColuna(coluna);
			return true;
		}
		
		return false;
	}
	
}
