package secao14HerancaPolimorfismo;

public class ContaBanco {

	public static void main(String[] args) {
	
		Conta acc = new Conta(1001, "Jorge", 0.0);
		ContaEmpresa bacc = new ContaEmpresa(1002, "Aline", 0.0, 500.0);
		
		// UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaEmpresa(1003, "Helo", 15000.00, 5000.00);
		Conta acc3 = new ContaPoupanca(1004, "Heloa", 1000.00, 3.54);
		Conta acc6 = new Conta(1010, "Luis Carlos", 1000.00);
		Conta acc7 = new ContaPoupanca(1020, "Aline Ferraz", 1000.00, 0.01);
		Conta acc8 = new ContaEmpresa(1030, "Marli", 1000.0, 500.0);
		
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
		acc2.saque(100.0);
		System.out.println(acc2.getSaldo());
		System.out.println("---------------------------");
		
		acc6.saque(200.00);
		System.out.println(acc6.getSaldo() + " = Com desconto da taxa");
		System.out.println("---------------------------");
		
		acc7.saque(200.00);
		System.out.println(acc7.getSaldo() + " = Sem desconto da taxa");
		System.out.println("---------------------------");
		
		acc8.saque(200.00);
		System.out.println(acc8.getSaldo() + " = Conta Empresarial, desconto diferenciado !!");
		System.out.println("---------------------------");
		
		// **** INTRODUÇÃO AO POLIMORFISMO ****
	
		Conta x = new Conta(1040, "Jorge", 1000.00);
		Conta y = new ContaPoupanca(1050, "Aline", 1000.00, 0.01);
		
		x.saque(50.00);
		y.saque(50.0);
		
		System.out.println("Saldo Disponivel para: " + x.getTitular() +" = R$ " + x.getSaldo());
		System.out.println("Saldo disponivel para: " + y.getTitular() + " = R$ " + y.getSaldo());
		System.out.println("-----------------------------");
	}

		
	
}
