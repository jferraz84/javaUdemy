package secao2AptdaLingagemJavaConcBasico;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioYouTube {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		// Teste numero 1
		
		/*int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);*/
		
		// Teste numero 2
		
		/*double  R, A1, pi = 3.14159;
		
		R= sc.nextDouble();
		
		A1 = pi * R * R;
		
		System.out.printf("O Valor da area �  = %.4f%n" , A1);*/
		
		// Teste numero 3
		
		/*int A, B, C ,D , Dif;
		
		A= sc.nextInt();
		B= sc.nextInt();
		C= sc.nextInt();
		D= sc.nextInt();
		
		Dif= A * B - C * D;
		
		System.out.println("A diferen�a dos valores dos produto � : " + Dif);*/
		
		// Teste numero 4
		
		/*int numero, horas;
		double valorHoras, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHoras = sc.nextDouble();
		
		salario = horas * valorHoras;
		
		System.out.printf("O valor salario do funcionario " +numero+ "  � de  R$ %.2f%n", salario);*/
		
		// Teste numero 5
		
		/*int CodPc1, CodPc2, NumPc1,  NumPc2;
		double ValorUniPC1, ValorUniPC2, ValorAPagar;
		
		System.out.println("Digite o codigo da pe�a ");
		CodPc1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual � a quantidade de pe�as ?");
		NumPc1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual � o valor unit�rio da pe�a ?");
		ValorUniPC1 = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.println("Digite o codigo da pe�a ");
		CodPc2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual � a quantidade de pe�as ?");
		NumPc2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual � o valor unit�rio da pe�a ?");
		ValorUniPC2 = sc.nextDouble();
		sc.nextLine();
		
		ValorAPagar= ValorUniPC1 * NumPc1 + ValorUniPC2 * NumPc2;
		
		System.out.printf("O valor total a pagar das pe�as �  : %.2f%n" ,ValorAPagar);*/
		
		// Teste Numero 6
		
       double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
       System.out.println("Qual � o valor de A :");
		A = sc.nextDouble();
		sc.nextLine();
		System.out.println("Qual � o valor de B :");
		B = sc.nextDouble();
		sc.nextLine();
		System.out.println("Qual � o valor de C :");
		C = sc.nextDouble();
		sc.nextLine();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		System.out.println("A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. ");
		System.out.printf(" R: TRIANGULO: %.3f%n", triangulo);
		System.out.println("A �rea do c�rculo de raio C. (pi = 3.14159) ");
		System.out.printf(" R: CIRCULO: %.3f%n", circulo);
		System.out.println("A �rea do trap�zio que tem A e B por bases e C por altura. ");
		System.out.printf(" R: TRAPEZIO: %.3f%n", trapezio);
		System.out.println("A �rea do quadrado que tem lado B");
		System.out.printf(" R: QUADRADO: %.3f%n", quadrado);
		System.out.println("A �rea do ret�ngulo que tem lados A e B.");
		System.out.printf(" R: RETANGULO: %.3f%n", retangulo);
		System.out.println("---------------------------------------------------------------");

		sc.close();
		
	}

}
