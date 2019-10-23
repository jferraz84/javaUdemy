package secao14Entidades;

public class PessoaFisica extends Pessoa {

	private double despesaSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, double rendaAnual, double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}

	public double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public Double imposto() {
		
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - despesaSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesaSaude * 0.5;
		}
	
	}
	
	

}
