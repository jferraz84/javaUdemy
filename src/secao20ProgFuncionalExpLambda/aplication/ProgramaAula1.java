package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class ProgramaAula1 {

	public static void main(String[] args) {

		List<Produto1> list = new ArrayList<>();

		list.add(new Produto1("TV", 900.0));
		list.add(new Produto1("Notebook", 1200.0));
		list.add(new Produto1("Tablet", 400.0));
		
		//list.sort(new MyComparator());
		// sem LAMBDA
		/*Comparator<Produto1> comp = new Comparator<Produto1>() {
			// sem LAMBDA
			@Override
			public int compare(Produto1 p1, Produto1 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};*/ 
		
		//PRIMEIRA OPÇÃO LAMBDA
		/*Comparator<Produto1> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		//SEGUNDA OPÇÃO LAMBDA
		//Comparator<Produto1> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		// TERCEIRA OPÇÃO
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		for (Produto1 p : list) {
			System.out.println(p);
		}

	}

}
