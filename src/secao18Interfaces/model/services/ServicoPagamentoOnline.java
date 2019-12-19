package secao18Interfaces.model.services;

public interface ServicoPagamentoOnline {

	double taxaDePagamento(double valor);
	double interesseDuracao(double valor, int meses);

}
