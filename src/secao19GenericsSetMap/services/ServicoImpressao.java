package secao19GenericsSetMap.services;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<T> {

	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista est� vazia");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[ ");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println(" ]");
	}
}
