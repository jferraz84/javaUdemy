package secao20ProgFuncionalExpLambda.util;

import java.util.function.Function;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class UperCasename implements Function<Produto1, String>{

	@Override
	public String apply(Produto1 p) {
		return p.getName().toUpperCase();
	}

}
