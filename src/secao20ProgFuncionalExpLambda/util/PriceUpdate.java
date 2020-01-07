package secao20ProgFuncionalExpLambda.util;

import java.util.function.Consumer;
import secao20ProgFuncionalExpLambda.entities.Produto1;


public class PriceUpdate implements Consumer<Produto1>{

	@Override
	public void accept(Produto1 p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
