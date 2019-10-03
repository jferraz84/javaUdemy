package secoes5678IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class MenbrosEstaticos {

    public static final double PI =3.14159;
    
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	//	Calculator calc = new Calculator();          // Resolu��o Vers�o 2
		
		//  Resolu��o Vers�o 1
		
		/*System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferencia : %.2f%n ", c);
		System.out.printf("Volume : %.2f%n ", v);
		System.out.printf("Valor de PI : %.2f%n ", PI);
	
		sc.close();
	}
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}*/
		 // Resolu��o Vers�o 2
		
		/*System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
	
		System.out.printf("Circunferencia : %.2f%n ", c);
		System.out.printf("Volume : %.2f%n ", v);
		System.out.printf("Valor de PI : %.2f%n ",calc. PI);*/
		
		// Resolu��o Vers�o 3
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
	
		System.out.printf("Circunferencia : %.2f%n ", c);
		System.out.printf("Volume : %.2f%n ", v);
		System.out.printf("Valor de PI : %.2f%n ",Calculator. PI);
		
   sc.close();
	}
}
