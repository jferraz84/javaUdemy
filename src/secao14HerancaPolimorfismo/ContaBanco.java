package secao14HerancaPolimorfismo;

public class ContaBanco {

	public static void main(String[] args) {
	
		Conta acc = new Conta(1001, "Jorge", 0.0);
		ContaEmpresa bacc = new ContaEmpresa(1002, "Aline", 0.0, 500.0);
		
		// UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaEmpresa(1003, "Helo", 15000.00, 5000.00);
		Conta acc3 = new ContaPoupanca(1004, "Heloa", 1000.00, 3.54);
		
		// DOWCASTING
		
		ContaEmpresa acc4 = (ContaEmpresa)acc2;
		acc4.emprestimo(100.0);
		
		//ContaEmpresa acc5 = (ContaEmpresa)acc3;  (ERRO)
		
		if (acc3 instanceof ContaEmpresa) {
			ContaEmpresa acc5 = (ContaEmpresa)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Empréstimo Realizado");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizarSaldo();
			System.out.println("Saldo Atualizado!");
			
		}
		
		System.out.println("");
		
	}

}
