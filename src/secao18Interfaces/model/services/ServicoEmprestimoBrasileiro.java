package secao18Interfaces.model.services;

public class ServicoEmprestimoBrasileiro implements InterfaceServico{

	private double taxaDeJuro;

	public ServicoEmprestimoBrasileiro(double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}

	@Override
	public double getTaxaDeJuro() {
		return taxaDeJuro;
	}

	
}
