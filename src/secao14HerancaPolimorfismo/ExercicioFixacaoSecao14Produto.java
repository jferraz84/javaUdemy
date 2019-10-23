package secao14HerancaPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14Entidades.Produto;
import secao14Entidades.ProdutoImportado;
import secao14Entidades.ProdutoUsado;

public class ExercicioFixacaoSecao14Produto {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> list = new ArrayList<>();

		System.out.print("Digitre o numero de Produtos: ");
		int n = sc.nextInt();
		System.out.println("=====================================================");

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto #" + i);
			System.out.print("Produto - COMUM, USADO, IMPORTADO = (c / u / i ) ?: ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (type == 'c') {

				list.add(new Produto(nome, preco));

			} else if (type == 'u') {

				System.out.print("Data de Fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, date));
			} else {

				System.out.print("Taxa Alfandegária: ");
				double taxaAlfandegaria = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
			}
			System.out.println("===============================================");
		}

		System.out.println("Etiquetas de Preço: ");
		for (Produto prod : list) {
			System.out.println(prod.etiquetaDePreco());

		}

		sc.close();
	}

}
