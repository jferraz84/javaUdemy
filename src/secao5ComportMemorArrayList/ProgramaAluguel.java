package secao5ComportMemorArrayList;


import java.util.Scanner;

public class ProgramaAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Alugar[] vect = new Alugar[10];

		System.out.println("Quantos quartos serão alugados ? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email do Inquilino : ");
			String email = sc.nextLine();
			System.out.print("Quarto :");
			int quarto = sc.nextInt();
			vect[quarto] = new Alugar(name, " Email: " + email);
			
		}
		System.out.println();  
		System.out.println("Quartos Alugados:"); 
		for (int i=0; i<10; i++) { 
			if (vect[i] != null) { 
			System.out.println("Quarto "+ i + ": " + vect[i]); 
		}
	  }

		
		sc.close();

	}

}
