package secao2AptdaLingagemJavaConcBasico;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaScanner {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); // Digitar 35 
		sc.nextLine();
		String name = sc.nextLine(); // Digitar Jorge 
		char gender = sc.next().charAt(0); // Digitar a letra M
		
		//b5
		String s = sc.next();
		char letter =s.charAt(0);
		int digito =Integer.parseInt(s.substring(1));
		
		// 4.32 vai ser digitado
		double n2 = sc.nextDouble();
		
		// Maria F 23 1.68
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double heigth = sc.nextDouble();
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digito);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(heigth);
		
		
		sc.close();

	}

}
