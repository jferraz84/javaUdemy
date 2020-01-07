package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import secao20ProgFuncionalExpLambda.entities.Produto1;
import secao20ProgFuncionalExpLambda.util.PriceUpdate;

public class ProgramaAula4Consumer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto1> list = new ArrayList<>();
		list.add(new Produto1("Tv", 900.00));
		list.add(new Produto1("Mouse", 50.00));
		list.add(new Produto1("Tablet", 350.50));
		list.add(new Produto1("HD Case", 80.90));
		
		/* • Implementação da interface
		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);*/
		
		/*• Reference method com método estático
		list.forEach(Produto1::staticPriceUpdate);
		list.forEach(System.out::println);*/
		
		/*• Reference method com método não estático
		list.forEach(Produto1::nonStaticPriceUpdate);
		list.forEach(System.out::println);*/
		
		/*• Expressão lambda declarada
		double factor = 1.1;
		Consumer<Produto1> cons = p -> p.setPrice(p.getPrice() * factor);
		list.forEach(cons);
		list.forEach(System.out::println);*/
		
		//• Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);
		
		
	}

}
