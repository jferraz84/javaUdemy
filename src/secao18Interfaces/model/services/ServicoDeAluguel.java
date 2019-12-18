package secao18Interfaces.model.services;

import secao18Interfaces.model.entities.AluguelDeCarro;
import secao18Interfaces.model.entities.NotaDePagam;

public class ServicoDeAluguel {

	private Double precoPorDia;
	private Double precoPorHora;
	
	private TaxaDeServico taxaDeServico;
	
	public ServicoDeAluguel() {
		
	}

	public ServicoDeAluguel(Double precoPorDia, Double precoPorHora, TaxaDeServico taxaDeServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaDeServico = taxaDeServico;
	}
	
	public void processoNotaDePagam(AluguelDeCarro aluguelDeCarro) {
		long t1 = aluguelDeCarro.getInicio().getTime();
		long t2 = aluguelDeCarro.getRetorno().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double pagamBasico;
		if (horas <= 12.0) {
			 pagamBasico = Math.ceil(horas) * precoPorHora;
		}
		else {
			 pagamBasico = Math.ceil(horas / 24) * precoPorDia;
		}
		
		double tax = taxaDeServico.tax(pagamBasico);
		
		aluguelDeCarro.setNotaDePagam(new NotaDePagam(pagamBasico, tax));
	}
	
	
}
