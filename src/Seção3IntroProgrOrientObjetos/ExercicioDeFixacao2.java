package Seção3IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		FixacaoDois fix2 = new FixacaoDois();

		System.out.println("Qual é o nome do funcionario :");
		fix2.nome = sc.next();
		System.out.println("Qual é o salario Bruto do funcionário :");
		fix2.salarioBruto = sc.nextDouble();
		System.out.println("Valor do imposto sobre o salario : ");
		fix2.imposto = sc.nextDouble();
		System.out.println("---------------------------------------------");
		System.out.println("Funcionario  " + fix2 );
		System.out.println();
		System.out.print("Valor da porcentagem de aumento no salario ? ");
		double porcentagem = sc.nextDouble();
		fix2.incremSalario(porcentagem);
		System.out.println();
		System.out.println("Atualização dos dados :  " + fix2);
		System.out.println("--------------------------------------------------");
		System.out.println("FIM DO PROGRAMA !");

		sc.close();
	}

}
