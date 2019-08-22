package Seção3IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ProgSemOrientObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite  as medidas do triangulo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2; 
		double areax = Math.sqrt( p * (p - xA) * (p -xB) * (p - xC));

		 p = (yA + yB + yC) / 2;
		double areay = Math.sqrt( p * (p - yA) * (p -yB) * (p - yC));
		
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
