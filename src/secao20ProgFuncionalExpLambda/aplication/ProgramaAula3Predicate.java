package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class ProgramaAula3Predicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto1> list = new ArrayList<>();
		list.add(new Produto1("Tv", 900.00));
		list.add(new Produto1("Mouse", 50.00));
		list.add(new Produto1("Tablet", 350.50));
		list.add(new Produto1("HD Case", 80.90));

		//PREDICADO
		//list.removeIf(new ProdutoPredicate());
		
		/* Reference method com m�todo est�tico
		list.removeIf(Produto1::staticProdutoPredicate);*/
		
		/*Reference method com m�todo N�O est�tico
		list.removeIf(Produto1::nonStaticProdutoPredicate);*/
		
		/* Express�o lambda DECLARADA
		Predicate<Produto1> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(pred);*/
		
		//Express�o lambda INLINE
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for (Produto1 p : list) {
			System.out.println(p);
		}		
		
	}

}
