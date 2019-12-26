package secao18Interfaces.model.services;

import java.security.InvalidParameterException;

public interface InterfaceServico {

	double getTaxaDeJuro();
	
	default double pagamento(double valor, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("A quantidade de meses tem que ser maior que zero!");
		}
		 return valor * Math.pow(1.0 + getTaxaDeJuro() / 100.0, meses);
	}
}
