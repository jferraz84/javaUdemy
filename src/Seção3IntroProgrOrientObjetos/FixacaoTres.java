package Seção3IntroProgrOrientObjetos;

public class FixacaoTres {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1  + nota2 + nota3;
	}
	
	public double pontosPerdidos() {
		
		if (notaFinal() < 100.0) {
			  return 100.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
