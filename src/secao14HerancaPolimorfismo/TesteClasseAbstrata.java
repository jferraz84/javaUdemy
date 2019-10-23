package secao14HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		

		/*Conta acc1 = new Conta(1000, "Jorge", 1000.00);
		Conta acc2 = new ContaPoupanca(1001, "Aline", 1000.00, 0.01);
		Conta acc3 = new ContaEmpresa(1002, "Helo", 1000.00, 500.00);*/
		
		Locale.setDefault(Locale.US);
		List<Conta> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "jorge", 500.00, 0.01));
		list.add(new ContaEmpresa(1002, "Aline", 1000.00, 400.00));
		list.add(new ContaPoupanca(1003, "Helo", 300.00, 0.01));
		list.add(new ContaEmpresa(1004, "Heloa", 500.00, 500.00));
		
		double soma = 0.0;
		for (Conta acc : list) {
			
			soma += acc.getSaldo();
		}
		
		System.out.printf("Saldo Total: %.2f%n", soma);
		
		for (Conta acc : list) {
			acc.deposito(10.00);
		}
		for (Conta acc : list) {
			System.out.printf("Atualização de Saldo para conta %d:  %.2f%n", acc.getNumero(), acc.getSaldo());
		}
		
	}

}
