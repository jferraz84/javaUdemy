package secao18Interfaces.model.entities;

public class NotaDePagam {

	private Double pagamBasico;
	private Double taxa ;
	
    public NotaDePagam() {
    	
    }

	public NotaDePagam(Double pagamBasico, Double taxa) {
		this.pagamBasico = pagamBasico;
		this.taxa = taxa;
	}

	public Double getPagamBasico() {
		return pagamBasico;
	}

	public void setPagamBasico(Double pagamBasico) {
		this.pagamBasico = pagamBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
    
    public Double getTotalPagam() {
    	return getPagamBasico() + getTaxa();
    }
}
