package secao20ProgFuncionalExpLambda.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import secao20ProgFuncionalExpLambda.entities.Funcionario;

public class ExercicioDeFixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do Arquivo: ");
		String arq = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(arq))){

			List<Funcionario> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.println("Digite o Salario: ");
			double sal = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(x -> x.getSalario() > sal)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());

			System.out.println("E-mail de pessoas cujo salário é superior a " + String.format("%.2f", sal) + ":");
			emails.forEach(System.out::println);

			double soma = list.stream()
					.filter(x -> x.getNome().charAt(0) == 'M')
					.map(x -> x.getSalario())
					.reduce(0.0, (x, y) -> x + y);

			System.out.println("Soma do salário de pessoas cujo nome começa com 'M': " + String.format("%.2f", soma));
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

		sc.close();

	}

}
