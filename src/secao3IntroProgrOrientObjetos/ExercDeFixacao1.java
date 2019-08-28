package secao3IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercDeFixacao1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		FixacaoUm fix1 = new FixacaoUm();
		
		System.out.println("Digite a Altura e Largura do seu retangulo :" );
		fix1.altura = sc.nextDouble();
		fix1.largura = sc.nextDouble();
		
		System.out.println("-------------------------------------------");
		System.out.printf("O valor da area é : %.2f%n", fix1.area());
		System.out.printf("O valor do primetro é : %.2f%n", fix1.perimetro());
		System.out.printf("O valor diagonal é :  %.2f%n", fix1.diagonal());
		System.out.println("-------------------------------------------");
		System.out.println("Fim do programa !");
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
