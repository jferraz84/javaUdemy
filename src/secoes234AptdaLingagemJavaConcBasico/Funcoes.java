package secoes234AptdaLingagemJavaConcBasico;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 numeros :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		/*if (a > b && a > c) {
			System.out.println("O maior é o  = " + a);
		} else if (b > c) {
			System.out.println("O maior é o = " + b);
		} else {
			System.out.println("O maior é o = " + c);
		}*/
		
		int higher = max(a, b, c);
		showResult(higher);
		
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("O maior é o = " + value);
	}

}
