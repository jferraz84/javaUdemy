package secao20ProgFuncionalExpLambda.util;

import java.util.List;
import java.util.function.Predicate;

import secao20ProgFuncionalExpLambda.entities.Produto1;

public class Produto1Service {

	public double filteredSum(List<Produto1> list, Predicate<Produto1> criterio) {
		double sum = 0.0;
		for (Produto1 p : list) {
			if (criterio.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
