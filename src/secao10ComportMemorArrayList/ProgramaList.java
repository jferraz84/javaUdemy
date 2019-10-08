package secao10ComportMemorArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaList {

	public static void main(String[] args) {
	
		
		List<String> list = new ArrayList<>();
		
		list.add("Jorge");
		list.add("Aline");
		list.add("Helo");
		list.add("Heloa");
		list.add(2, "Marcos");
	
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
        System.out.println("-------------------");
		
		//list.remove(1);
		//list.removeIf(x -> x.charAt(0) == 'H' );
		
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println("---------------------");
		System.out.println("Index of Helo: " +list.indexOf("Helo"));
		System.out.println("-------------------");
		
		List<String> result =  list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
			
		}
		System.out.println("---------------------");
		
        String name =  list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
			System.out.println(name);
			
		
		
	}

}
