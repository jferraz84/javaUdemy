package secao16Xadrez;

import secao16TabuleiroJogo.Posicao;
import secao16TabuleiroJogo.Tabuleiro;
import secao16Xadrez.pecas.Rei;
import secao16Xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configInicial();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
				
			}
		}
		return mat;
	}
	
	private void configInicial() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Color.BRANCO), new Posicao(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Color.PRETO), new Posicao(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Color.BRANCO), new Posicao(7, 4));
	}
}
