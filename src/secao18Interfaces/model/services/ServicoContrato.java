package secao18Interfaces.model.services;

import java.util.Calendar;
import java.util.Date;

import secao18Interfaces.model.entities.Contrato;
import secao18Interfaces.model.entities.Prestacao;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processoContrato(Contrato contrato, int meses) {
		double cotaBasica = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			Date date = addMeses(contrato.getData(), i);
			double updateCota = cotaBasica + servicoPagamentoOnline.interesseDuracao(cotaBasica, i);
			double fullCota = updateCota + servicoPagamentoOnline.taxaDePagamento(updateCota);
			contrato.addPrestacao(new Prestacao(fullCota, date));
		}
	}

	private Date addMeses(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
