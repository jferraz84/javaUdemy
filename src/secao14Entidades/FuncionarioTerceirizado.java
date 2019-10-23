package secao14Entidades;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double comissaoAdic;
	
	public FuncionarioTerceirizado() {
		 
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHoras, Double comissaoAdic) {
		super(nome, horas, valorHoras);
		this.comissaoAdic = comissaoAdic;
	}

	public Double getComissaoAdic() {
		return comissaoAdic;
	}

	public void setComissaoAdic(Double comissaoAdic) {
		this.comissaoAdic = comissaoAdic;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + comissaoAdic * 1.1;
	}
	
}
