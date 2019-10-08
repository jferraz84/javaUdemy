package secao10ComportMemorArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionarioDescricao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		// Parte 1
		
		System.out.print("Quantos funcionarios serão registrados ? "); // How many employees will be registered ??
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Func #" + i + ": " );
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			list.add(new Funcionario(id, name, salary));
		}
			// Aumentar o salario de um funcionario
			
			System.out.println("--------------------------------------");
			System.out.print("Digite o ID do  funcionario que terá um aumneto de salario: ");
			int id1 = sc.nextInt();
			
			Funcionario func = list.stream().filter(x -> x.getId() == id1).findFirst().orElse(null);
			
			if (func == null) {
				System.out.println("Este id não existe!");
			}
			
			else {
				System.out.print("Digite a porcentagem de aumento: ");

				double porcentagem = sc.nextDouble();

				func.aumentarSalary(porcentagem);

			}
			System.out.println("-----------------------------------");
			System.out.println("Lista de funcionários e salarios" );
			
			for (Funcionario obj : list) {
				System.out.println(obj);
			}
			System.out.println("Fim do Programa");
		
		sc.close();

	}

}
