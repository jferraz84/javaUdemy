package secao16Xadrez;

import secao16TabuleiroJogo.Tabuleiro;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[] [] mat = new PecaXadrez[tabuleiro.getLinha()] [tabuleiro.getColuna()];
		for (int i = 0; i < tabuleiro.getLinha(); i++) {
			for (int j = 0; j < tabuleiro.getColuna(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, i);
				
			}
		}
		return mat;
	}
}
