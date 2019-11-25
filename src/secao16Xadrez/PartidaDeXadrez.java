package secao16Xadrez;

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
	
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca){
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void configInicial() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro, Color.BRANCO));
		colocarNovaPeca('e', 8, new Rei(tabuleiro, Color.PRETO));
		colocarNovaPeca('e', 1, new Rei(tabuleiro, Color.BRANCO));
	}
}
