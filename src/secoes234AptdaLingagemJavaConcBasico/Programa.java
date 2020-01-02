package secoes234AptdaLingagemJavaConcBasico;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean completed = false;
		char gender = '\u0041';
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L;
		float n5 = 4.5f;
		double n6 = 4.5;
		
		double a;
		float b;
		
		a = 5.0;
		b = (float) a;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Olá Mundo !");
		System.out.println(gender);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5  + " float");
		System.out.println(n6 + " double ");
		System.out.println(b);
		System.out.println("São tds os resultados das variaveis !!");

		sc.close();
	}

}
