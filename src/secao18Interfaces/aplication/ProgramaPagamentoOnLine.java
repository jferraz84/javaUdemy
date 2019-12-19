package secao18Interfaces.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao18Interfaces.model.entities.Contrato;
import secao18Interfaces.model.entities.Prestacao;
import secao18Interfaces.model.services.PaypalServico;
import secao18Interfaces.model.services.ServicoContrato;

public class ProgramaPagamentoOnLine {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		char resp ;
		do {
		System.out.println("Digite os dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data: ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do Contrato: ");
		double valorCont = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorCont);
		
		System.out.println("Qual numero de Prestacoes: ");
		int n = sc.nextInt();
		System.out.println("---------------------------------------");
		
		ServicoContrato servicoContrato = new ServicoContrato(new PaypalServico());
		
		servicoContrato.processoContrato(contrato, n);
		
		System.out.println("Prestacoes: ");
		for (Prestacao x : contrato.getPrestacoes()) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		
		System.out.println("Deseja repetir (s/n) ? ");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		System.out.println("Fim do progrma  ! ");
		sc.close();
		
	}

}
