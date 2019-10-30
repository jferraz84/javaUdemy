package secao15TratamentoDeExcecoes;

import java.util.Locale;
import java.util.Scanner;

import secao15Model.Entidades.Conta;
import secao15Model.exceptions.DomainExceptions;

public class ContaBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados da conta: ");
		System.out.print("NUmero: ");
		int numero = sc.nextInt();
		System.out.print("Usuario: ");
		sc.nextLine();
		String usuario = sc.nextLine();
		System.out.print("Saldo Incial: ");
		double saldoInic = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		double limitSaque = sc.nextDouble();
		
		Conta acc = new Conta(numero, usuario, saldoInic, limitSaque);
		
		System.out.println("--------------------------------");
		System.out.println("Digite o valor para o Saque: ");
		double valor = sc.nextDouble();
		
		try {
			acc.saque(valor);
			System.out.println("============================");
			System.out.println("Atualização do Saldo");
			System.out.println("Novo saldo: " + String.format("%.2f", acc.getSaldo()));
			
		} catch (DomainExceptions e) {
			System.out.println("Erro no Saque: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
