package secao14Entidades;

public class PessoaJuridica extends Pessoa {

	private int numeroFunc;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public int getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(int numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public Double imposto() {
		if (getNumeroFunc() > 10) {
			return getRendaAnual() * 0.14;
			
		} else {
			
			return getRendaAnual() * 0.16;
		}

	}

}
