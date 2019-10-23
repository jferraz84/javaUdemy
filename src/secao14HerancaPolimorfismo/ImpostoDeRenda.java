package secao14HerancaPolimorfismo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14Entidades.Pessoa;
import secao14Entidades.PessoaFisica;
import secao14Entidades.PessoaJuridica;

public class ImpostoDeRenda {

	public static void main(String[] args)   throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
 		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		System.out.println("=========================================");
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte nº: "+ i);
			System.out.print("Pessoa FÍSICA ou JURÍDICA (f / j)? = ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: R$ ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Despesas com saúde: R$ ");
				double despesaSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
				
			}else {
				System.out.println("Número de funcionários: ");
				int numeroFunc = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFunc));
			}
			System.out.println("============================================");
			
		}
		double soma = 0.0;
		System.out.println("IMPOSTOS PAGOS: ");
		for (Pessoa pessoa : list) {
			double imposto = pessoa.imposto();
			System.out.println(pessoa.getNome()+ ": R$ " + String.format("%.2f", imposto));
			soma += imposto;

		}
		 System.out.println("=================================================");
		 System.out.println("TOTAL DE IMPOSTOS: R$ "+ String.format("%.2f", soma)); 
		 
		sc.close();

	}

}
