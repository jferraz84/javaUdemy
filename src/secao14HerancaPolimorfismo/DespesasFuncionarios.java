package secao14HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14Entidades.Funcionario;
import secao14Entidades.FuncionarioTerceirizado;

public class DespesasFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.print("Qual a quantidade de funcionários : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário #" + i);
			System.out.print("O funcionário é Terceirizado (S/N) ? = ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double valorHoras = sc.nextDouble();

			if (ch == 'S') {
				System.out.print("Comissão Adicional :");
				double comissaoAdic = sc.nextDouble();
				// Funcionario func = new FuncionarioTerceirizado(nome, horas, valorHoras, comissaoAdic); // ou ...
				list.add(new FuncionarioTerceirizado(nome, horas, valorHoras, comissaoAdic));
			} else {
				//Funcionario func = new Funcionario(nome, horas, valorHoras); // Mesma coisa aqui.
				list.add(new Funcionario(nome, horas, valorHoras));
			}

		}
		System.out.println("-----------------------------------------");
		System.out.println("PAGAMENTOS :");
		for (Funcionario func : list) {
			System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
			
		}

		sc.close();
	}

}
