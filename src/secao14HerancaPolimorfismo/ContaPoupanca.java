package secao14HerancaPolimorfismo;

public class ContaPoupanca extends Conta{
	
	private double taxaDeJuro ;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String titular, double saldo, double taxaDeJuro) {
		super(numero, titular, saldo);
		this.taxaDeJuro = taxaDeJuro;
	}

	public double getTaxaDeJuro() {
		return taxaDeJuro;
	}

	public void setTaxaDeJuro(double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuro;
	}
}
