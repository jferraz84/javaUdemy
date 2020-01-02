package secao19GenericsSetMap.aplication;

import secao19GenericsSetMap.entitis.Cliente;

public class ProgramaAula5 {

	public static void main(String[] args) {

		/*// Equals
		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));
		System.out.println();

		// HashCode
		String a1 = "Maria";
		String b1 = "Alex";
		
		System.out.println(a1.hashCode());
		System.out.println(b1.hashCode());*/
		
		Cliente c1 = new Cliente("Jorge", "jferraz@cpqd.com.br");
		Cliente c2 = new Cliente("Jorge", "jferraz@cpqd.com.br");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
	}

}
