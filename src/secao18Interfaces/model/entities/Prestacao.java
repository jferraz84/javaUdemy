package secao18Interfaces.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Double valor;
	private Date dataDeVenc;
	
	public Prestacao(Double valor, Date dataDeVenc) {
		this.valor = valor;
		this.dataDeVenc = dataDeVenc;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataDeVenc() {
		return dataDeVenc;
	}

	public void setDataDeVenc(Date dataDeVenc) {
		this.dataDeVenc = dataDeVenc;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataDeVenc) + " - " + String.format("%.2f", valor);
 	}
}
