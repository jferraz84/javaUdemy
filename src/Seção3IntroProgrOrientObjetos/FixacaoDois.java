package Seção3IntroProgrOrientObjetos;

public class FixacaoDois {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiq() {
		return salarioBruto - imposto;
	}
	
	public void  incremSalario(Double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f" , salarioLiq());
	}
}
