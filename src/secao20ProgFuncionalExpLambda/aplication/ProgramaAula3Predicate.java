package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class ProgramaAula3Predicate {

	public static void main(String[] args) {

		List<Produto1> list = new ArrayList<>();
		list.add(new Produto1("Tv", 900.00));
		list.add(new Produto1("Mouse", 50.00));
		list.add(new Produto1("Tablet", 350.50));
		list.add(new Produto1("HD Case", 80.90));

		//PREDICADO
		//list.removeIf(new ProdutoPredicate());
		
		/* Reference method com método estático
		list.removeIf(Produto1::staticProdutoPredicate);*/
		
		/*Reference method com método não estático
		list.removeIf(Produto1::nonStaticProdutoPredicate);*/
		
		/* Expressão lambda declarada
		Predicate<Produto1> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(pred);*/
		
		//Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for (Produto1 p : list) {
			System.out.println(p);
		}		
		
	}

}
