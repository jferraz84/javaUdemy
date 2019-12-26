package secao18Interfaces.aplication;

import java.util.Locale;
import java.util.Scanner;

import secao18Interfaces.model.services.InterfaceServico;
import secao18Interfaces.model.services.ServicoEmprestimoBrasileiro;
import secao18Interfaces.model.services.ServicoEmprestimoUsa;

public class ProgramaMetodosDefault {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		InterfaceServico us = new ServicoEmprestimoUsa(1.0);
		double receber = us.pagamento(valor, meses);
		
		System.out.println("Pagamento será " + meses + " meses");
		System.out.println(String.format("%.2f", receber));
		
		/*ServicoEmprestimoBrasileiro is = new ServicoEmprestimoBrasileiro(2.0);
		double pagamento = is.pagamento(valor, meses);
		
		System.out.println("Pagamento será " + meses + " meses");
		System.out.println(String.format("%.2f", pagamento));*/
		
		sc.close();
	}

}
