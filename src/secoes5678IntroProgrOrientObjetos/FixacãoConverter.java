package secoes5678IntroProgrOrientObjetos;

public class FixacãoConverter {

    public static double IOF = 0.06;
    
    public static double converPraReal(double valor, double precoDolar) {
    	return valor * precoDolar * (1.0 + IOF);
 }

}
