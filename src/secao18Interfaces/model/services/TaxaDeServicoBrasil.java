package secao18Interfaces.model.services;

public class TaxaDeServicoBrasil implements TaxaDeServico {

	public double tax(double valor) {
		if (valor <= 100.0) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}

	
}
