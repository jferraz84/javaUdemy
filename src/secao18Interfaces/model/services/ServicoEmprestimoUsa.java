package secao18Interfaces.model.services;

public class ServicoEmprestimoUsa implements InterfaceServico{

	private double taxaDeJuro;

	public ServicoEmprestimoUsa(double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}
	
	@Override
	public double getTaxaDeJuro() {
		return taxaDeJuro;
	}

}
