package secao19GenericsSetMap.aplication;

import java.util.HashSet;
import java.util.Set;

import secao19GenericsSetMap.entitis.ProdutoSet;

public class ProgramaSetIgualdade {

	public static void main(String[] args) {

		Set<ProdutoSet> set = new HashSet<>();
		
		set.add(new ProdutoSet("TV", 900.0));
		set.add(new ProdutoSet("Notebook", 1200.0));
		set.add(new ProdutoSet("Tablet", 400.0));
		
		ProdutoSet prod = new ProdutoSet("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
