package secao18Interfaces.model.entities;

import java.util.Date;

public class AluguelDeCarro {

	private Date inicio;
	private Date retorno;
	
	private Veiculo veiculo;
	private NotaDePagam notaDePagam;
	
	public AluguelDeCarro() {
		
	}

	public AluguelDeCarro(Date inicio, Date retorno, Veiculo veiculo) {
		this.inicio = inicio;
		this.retorno = retorno;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaDePagam getNotaDePagam() {
		return notaDePagam;
	}

	public void setNotaDePagam(NotaDePagam notaDePagam) {
		this.notaDePagam = notaDePagam;
	}
	
}
