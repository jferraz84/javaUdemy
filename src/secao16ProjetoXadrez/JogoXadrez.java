package secao16ProjetoXadrez;

import secao16Xadrez.PartidaDeXadrez;
import secao16Xadrez.PecaXadrez;

public class JogoXadrez {

	public static void main(String[] args) {
		
		PartidaDeXadrez partidadeXadrez = new PartidaDeXadrez();
		UI.printTabuleiro(partidadeXadrez.getPecas());
		
	
	}
}
