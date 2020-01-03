package secao19GenericsSetMap.aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioFixacao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("Quantos alunos tem no curso A ? : ");
		int  n = sc.nextInt() ;
		System.out.println("Digite suas matriculas: ");
		
		for (int i = 0; i < n ; i++) {
			int numero = sc.nextInt();
			a.add(numero);
		}
		
		System.out.print("Quantos alunos tem no curso B ? : ");
		n = sc.nextInt() ;
		System.out.println("Digite suas matriculas: ");
		
		for (int i = 0; i < n ; i++) {
			int numero = sc.nextInt();
			b.add(numero);
		}
		
		System.out.print("Quantos alunos tem no curso C ? : ");
		n = sc.nextInt() ;
		System.out.println("Digite suas matriculas: ");
		
		for (int i = 0; i < n ; i++) {
			int numero = sc.nextInt();
			c.add(numero);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("A quantidade total de alunos é: " + total.size());
		
		sc.close();

	}

}
