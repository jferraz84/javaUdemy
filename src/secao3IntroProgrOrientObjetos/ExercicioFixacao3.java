package secao3IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FixacaoTres fix3 = new FixacaoTres();
		
		System.out.println("Qual é o nome do aluno: ");
		fix3.nome = sc.next();
		System.out.println("Quais as notas do aluno: ");
		fix3.nota1 = sc.nextDouble();
		fix3.nota2 = sc.nextDouble();
		fix3.nota3 = sc.nextDouble();
		
		System.out.printf("A nota final foi :  %.2f%n " , fix3.notaFinal());
		if (fix3.notaFinal() < 100.0) {
			System.out.println("O aluno está REPROVADO com a nota " + fix3.notaFinal());
			System.out.printf("Pontos que faltaram %.2f pontos%n ", fix3.pontosPerdidos());
		} else {
			System.out.println("O aluno está APROVADO com a nota Final " + fix3.notaFinal());
		}
		System.out.println("Fim do PROGRMA !");
		
		sc.close();
	}

}
