package secao20ProgFuncionalExpLambda.util;

import java.util.function.Predicate;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class ProdutoPredicate implements Predicate<Produto1>{

	@Override
	public boolean test(Produto1 p) {
		return p.getPrice() >= 100.0;
	}

	
}
