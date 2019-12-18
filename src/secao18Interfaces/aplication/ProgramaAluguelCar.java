package secao18Interfaces.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao18Interfaces.model.entities.AluguelDeCarro;
import secao18Interfaces.model.entities.Veiculo;
import secao18Interfaces.model.services.ServicoDeAluguel;
import secao18Interfaces.model.services.TaxaDeServicoBrasil;

public class ProgramaAluguelCar {

	public static void main(String[] args) throws ParseException{
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Digite os dados do Aluguel");
		System.out.print("Modelo do Carro: ");
		String modelCar = sc.nextLine();
		System.out.print("Data da locação / (dd/MM/yyyy HH:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Data da devolução / (dd/MM/yyyy HH:ss): ");
		Date retorno = sdf.parse(sc.nextLine());
		
		AluguelDeCarro ac = new AluguelDeCarro(inicio, retorno, new Veiculo(modelCar));
		
		System.out.println("-----------------------------------");
		System.out.print("Digite o valor do aluguel/HR: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Digite o valor do aluguel/DIA: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorDia, precoPorHora, new TaxaDeServicoBrasil());
		servicoDeAluguel.processoNotaDePagam(ac);
		
		System.out.println("------------------------------------");
		System.out.println("Nota de Pagamento: ");
		System.out.println("Pagamento Básico: " + String.format("%.2f", ac.getNotaDePagam().getPagamBasico()));
		System.out.println("Pagamento Taxas : " + String.format("%.2f", ac.getNotaDePagam().getTaxa()));
		System.out.println("Pagamento Total : " + String.format("%.2f", ac.getNotaDePagam().getTotalPagam()));
		
		
		sc.close();
	}

}
