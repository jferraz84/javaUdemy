package secao14HerancaPolimorfismo;

public class ContaEmpresa extends Conta {

	private double emprestimoLimt;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(int numero, String titular, double saldo, double emprestimoLimt) {
		super(numero, titular, saldo);
		this.emprestimoLimt = emprestimoLimt;
	}

	public double getEmprestimoLimt() {
		return emprestimoLimt;
	}

	public void setEmprestimoLimt(double emprestimoLimt) {
		this.emprestimoLimt = emprestimoLimt;
	}

	public void emprestimo(double valor) {
		if (valor <= emprestimoLimt) {
			saldo += valor - 10.0;
		}
	}

	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
}
