package secoes5678IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacaoConverter {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cota��o do d�lar no dia : ");
		double precoDolar = sc.nextDouble();
		System.out.println("Qual Valor em dolar precisa : ");
		double valor = sc.nextDouble();
		double result = Fixac�oConverter.converPraReal(valor, precoDolar);
		System.out.printf("O valor total em reais  para troca ser� de : R$ %.2f%n ", result);
		
	
		
		sc.close();
	}

}
