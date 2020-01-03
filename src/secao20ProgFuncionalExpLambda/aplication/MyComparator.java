package secao20ProgFuncionalExpLambda.aplication;

import java.util.Comparator;
import secao20ProgFuncionalExpLambda.entities.Produto1;

public class MyComparator implements Comparator<Produto1>{

	@Override
	public int compare(Produto1 p1, Produto1 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

	
}
