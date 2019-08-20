package secao2AptdaLingagemJavaConcBasico;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSessa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Iniciando o Programa !!!");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual é o seu nome : ");
		String name = sc.next();
		System.out.println("Quantas pessoas moram com você ?");
		int moradores = sc.nextInt();
		System.out.println("Quanto paga de aluguel ?");
		double ValorCasa = sc.nextDouble();
		System.out.println("Diga seu sobrenome sua idade e sua altura ");
		String name2 = sc.next();
		int idade = sc.nextInt();
		double alt = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(moradores);
		System.out.printf("%.2f%n", ValorCasa);
		System.out.println(name2);
		System.out.println(idade);
		System.out.printf("%.2f%n", alt);
		
		sc.close();

	}

}
