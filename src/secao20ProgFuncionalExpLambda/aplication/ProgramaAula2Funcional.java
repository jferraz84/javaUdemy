package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.List;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class ProgramaAula2Funcional {

	public static int compare(Produto1 p1, Produto1 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Produto1> list = new ArrayList<>();

		list.add(new Produto1("TV", 900.0));
		list.add(new Produto1("Notebook", 1200.0));
		list.add(new Produto1("Tablet", 400.0));

		list.sort(ProgramaAula2Funcional::compare );

		for (Produto1 p : list) {
			System.out.println(p);
		}

	}

}
