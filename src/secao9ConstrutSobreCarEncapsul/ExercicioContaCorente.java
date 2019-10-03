package secao9ConstrutSobreCarEncapsul;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioContaCorente {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Digite o numero da conta :  ");
		int numeroConta = sc.nextInt();
		System.out.print("Digite o nome do Titular da conta : ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Existe um depósito inicial :   (s/n) ");
		char resp = sc.next().charAt(0);

		if (resp == 'y') {
			System.out.print("Digite o valor do depostio: ");
			double inicialDeposito = sc.nextDouble();
			conta = new Conta(numeroConta, nome, inicialDeposito);
		} else {
				conta = new Conta (numeroConta , nome);
			
		}
		
		System.out.println();
		System.out.println("Dados da Conta :  ");
		System.out.println(conta);
		
		System.out.println("------------------------------------------------------");
		System.out.print("Insira um valor de depósito : R$ ");
		double depositoValor = sc.nextDouble();
		conta.deposito(depositoValor);
		System.out.println("Atualizando dados da conta:");
		System.out.println(conta);
		System.out.println("--------------------------------------------------------");
		
		System.out.println();
		System.out.println("Qual o valor do saque : ");
		System.out.println("OBS = È cobrado uma taxa de R$ 2,34 por saque");
		double saqueValor = sc.nextDouble();
		conta.saque(saqueValor);
		System.out.println("Atualizando dados da conta");
		System.out.println(conta);

		sc.close();

	}

}
