package secao13EnumeracoesComposicoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao13PacoteEntidades.Enums.ContratoHora;
import secao13PacoteEntidades.Enums.Departamento;
import secao13PacoteEntidades.Enums.NivelTrabalho;
import secao13PacoteEntidades.Enums.Trabalhador;

public class ExercicioResolvido1 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("--------------------------------------");
		System.out.print("Digite o departamento do Trabalhador: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Digite os dados do trabalahdor: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Qual é o nivel de experiencia do Trabalhador: ");
		String nivelTrabalho = sc.nextLine();
		System.out.print("Qual salario base do Trabalhador: ");
		Double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador,NivelTrabalho.valueOf(nivelTrabalho), +
				+ salarioBase, new Departamento(departamentoNome));
		
		System.out.println("Quantos contratos o trabalhador tem? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do contrato #"+ i + " data: ");
			System.out.print("Digite a data: (DD/MM/YYYY): ");
			Date contratoDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			int horas = sc.nextInt();
			ContratoHora contrato = new  ContratoHora(contratoDate,valorHora, horas );
			trabalhador.addContrato(contrato);		
		}
		System.out.println("-----------------------------------------------------");
		System.out.print("Digite mes e ano para calcular o salário: ");
		String mesEano =sc.next();
		int mes = Integer.parseInt(mesEano.substring( 0, 2));
		int ano = Integer.parseInt(mesEano.substring( 3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
		System.out.println("O ganho total foi " + mesEano + ": " + String.format("%.2f", trabalhador.calcular(ano, mes)));
		
		sc.close();
	}

}
