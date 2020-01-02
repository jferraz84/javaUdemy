package secao19GenericsSetMap.aplication;

import java.util.Set;
import java.util.TreeSet;
import secao19GenericsSetMap.entitis.ProdutoSet;

public class ProgramaTreeSetCompara {

	public static void main(String[] args) {

		Set<ProdutoSet> set = new TreeSet<>();
		
		set.add(new ProdutoSet("TV", 900.0));
		set.add(new ProdutoSet("Notebook", 1200.0));
		set.add(new ProdutoSet("Tablet", 400.0));
		
		for (ProdutoSet p : set) {
			System.out.println(p);
		}

	}

}
