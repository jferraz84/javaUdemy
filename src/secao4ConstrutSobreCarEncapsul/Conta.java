package secao4ConstrutSobreCarEncapsul;

public class Conta {

	private int numeroConta;
	private String name;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, String name) {
		
		this.numeroConta = numeroConta;
		this.name = name;
	}

	public Conta(int numeroConta, String name, double inicialDeposito) {
	
		this.numeroConta = numeroConta;
		this.name = name;
		deposito(inicialDeposito);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double amount) {
		saldo += amount;
	}
	
	public void saque(double amount) {
		saldo -= amount + 2.34;
	}

	public String toString() {
		return "Conta "
				+ numeroConta 
				+ ",   Nome =  " 
				+ name 
				+ ",  Saldo Disponível = R$ "
				+ String.format("%.2f", saldo);
		
		
	}
	
	
	
}
