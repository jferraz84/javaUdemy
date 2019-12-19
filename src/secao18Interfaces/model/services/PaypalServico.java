package secao18Interfaces.model.services;

public class PaypalServico implements ServicoPagamentoOnline {

	private static final double TAXA_PORCENTAGEM = 0.02;
	private static final double MESES_INTERESSE = 0.01;

	@Override
	public double taxaDePagamento(double valor) {
		return valor * TAXA_PORCENTAGEM;

	}

	@Override
	public double interesseDuracao(double valor, int meses) {
		return valor * MESES_INTERESSE * meses; 
	}
	
	

}
