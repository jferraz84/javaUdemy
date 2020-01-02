package secao19GenericsSetMap.aplication;

import java.util.Arrays;
import java.util.List;

public class ProgramaAula3 {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Jorge, Aline, Lolo, Heloa");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
