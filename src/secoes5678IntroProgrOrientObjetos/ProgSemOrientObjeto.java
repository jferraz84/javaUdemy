package secoes5678IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ProgSemOrientObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		TrianguloOrientObjeto x, y;
		x = new TrianguloOrientObjeto();
		y = new TrianguloOrientObjeto();
		
		System.out.println("Digite  as medidas do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		/*double p = (x.a + x.b + x.c) / 2; 
		double areax = Math.sqrt( p * (p - x.a) * (p -x.b) * (p - x.c));*/

		 /*p = (y.a + y.b + y.c) / 2;
		double areay = Math.sqrt( p * (p - y.a) * (p -y.b) * (p - y.c));*/
		
		System.out.printf("A area do Triangulo X é : %.4f%n ", areax );
		System.out.printf("A area do Triangulo y é : %.4f%n", areay );
		
		if (areax > areay) {
			System.out.println("A area X é a maior area");
		} else {
			System.out.println("A area y é a maior area");
		}

		sc.close();
	}

}
