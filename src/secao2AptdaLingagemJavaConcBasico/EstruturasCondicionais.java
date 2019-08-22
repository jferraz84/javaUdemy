package secao2AptdaLingagemJavaConcBasico;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Função IF - ELSE

		/*
		 * System.out.println("Que horas são por favor ?:"); int n = sc.nextInt();
		 * 
		 * if (n < 12) { System.out.println("Bom dia !! "); } else if (n < 18) {
		 * System.out.println("Boa Tarde !! "); } else if (n >= 18) {
		 * System.out.println("Boa noite !!"); }
		 * 
		 * int A, B, C;
		 * 
		 * System.out.println("Digite 3 valores !!"); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int c = sc.nextInt();
		 * 
		 * if (a > b && a > c) { System.out.println("O maior numero é  = " + a); } else
		 * if (b > c) { System.out.println("O maior numero é = " + b); } else {
		 * System.out.println("O maior numero é  = " + c); }
		 */

		// Função SWITCH CASE
		/*
		 * System.out.println("Em que dia da semana estamos ?");
		 * 
		 * int x = sc.nextInt(); String day; switch (x) { case 1: day = "Domingo";
		 * break; case 2: day = "Segunda - feira"; break; case 3: day = "Terça - feira";
		 * break; case 4: day = "Quarta - feira"; break; case 5: day = "Quinta - feira";
		 * break; case 6: day = "Sexta - feira"; break; case 7: day = "Sábado - feira";
		 * break; default: day = "Dia Inválido !!!"; } System.out.println("Day: " +
		 * day);
		 */

		// Expressão Condicional TERNÁRIA

		/*
		 * double preco = 19.5; double desconto = (preco < 20.0) ? preco * 0.1 : preco *
		 * 0.05; double total = preco - desconto ;
		 * 
		 * System.out.println("O valor da mercadoria é : " + preco);
		 * System.out.printf("O valor do desconto será de R$ %.2f%n", desconto);
		 * System.out.printf("O total a ser pago é R$ %.2f%n", total);
		 */

		// Função WHILE

		/*System.out.println("Digite um numero : ");
		double n = sc.nextDouble();

		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.println("Digite outro numero : ");
			n = sc.nextDouble();

		}
		System.out.println("Numero Negativo !!");*/
		
		
		// Função FOR
		
		/*System.out.print("Quantos numeros inteiros vai digitar :  " );
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= n ; i++) {
			System.out.println("Valor numero "+ i + ": ");
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("O valor dos valores é = " + soma);*/
		
		// Função DO-WHILE
		
		char resp ;
		do {
		      System.out.println("Digite um numero :");
		      double n = sc.nextInt();
		      double sq = Math.sqrt(n);
		
		System.out.printf("Raíz quadrada é : %.3f%n", n );
		
		System.out.println("Deseja repetir (s/n) ? ");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		System.out.println("Fim do progrma  ! ");
		
		sc.close();

	}

}
