package secoes234AptdaLingagemJavaConcBasico;

import java.util.Scanner;

public class ExercicioEstrutCondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * // Teste 01 
		 * System.out.println("Digite a senha de acesso : "); int senha =
		 * sc.nextInt();
		 * 
		 * while (senha != 2019) { 
		 * System.out.println("Senha Inválida !"); senha =
		 * sc.nextInt(); } 
		 * System.out.println("Acesso Permitido");
		 * System.out.println("Seja bem vindo Sr° Jorge Ferraz");
		 */

		/*
		 * // Teste 02
		 *  int x = sc.nextInt();
		 *  int y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) { 
		 * 	  if (x > 0 && y > 0) {
		 * System.out.println("primeiro"); 
		 *     } else if (x < 0 && y > 0) {
		 * System.out.println("segundo"); 
		 *     } else if (x < 0 && y < 0) {
		 * System.out.println("terceiro"); 
		 *     } else { System.out.println("quarto"); } x =
		 * sc.nextInt(); 
		 * y = sc.nextInt(); }
		 */

		// Teste 03

		/*int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Deseja abastecer com qual combustivel ? ");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}
			System.out.println("Deseja abastecer com qual combustivel ? ");
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);*/
		
		// Teste FOR
		
         /* int n = sc.nextInt();
		
		   for (int i=1; i<=n; i++) {

			      int primeiro = i;
			      int segundo = i * i;
			      int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}*/
		
		// Exercicio de Fixação WHILE - FOR
		
		System.out.println("Digite um um valor ");
		int n = sc.nextInt();
		
		while (n <= 0 ) {
			System.out.println("O numero não pode ser negativo, Tente de novo ");
			n = sc.nextInt();
		}
		
		int maior = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			System.out.println("Valor do Num: "+ i + ":");
			int x= sc.nextInt();
			if (x > maior) {
				maior = x;
			}
		}
		System.out.println("O maior valor é : " + maior);
		
		sc.close();
	}

}
