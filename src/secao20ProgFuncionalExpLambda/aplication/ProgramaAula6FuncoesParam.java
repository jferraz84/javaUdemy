package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import secao20ProgFuncionalExpLambda.entities.Produto1;
import secao20ProgFuncionalExpLambda.util.Produto1Service;

public class ProgramaAula6FuncoesParam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Produto1> list = new ArrayList<>();
		list.add(new Produto1("Tv", 900.00));
		list.add(new Produto1("Mouse", 50.00));
		list.add(new Produto1("Tablet", 350.50));
		list.add(new Produto1("HD Case", 80.90));

		Produto1Service ps = new Produto1Service();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Soma = " + String.format("%.2f", sum));
	}

}
