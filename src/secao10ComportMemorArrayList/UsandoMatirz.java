package secao10ComportMemorArrayList;

import java.util.Scanner;

public class UsandoMatirz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				mat [i] [j] = sc.nextInt();
 			}
			
		}
		System.out.println("--------------------------------");
		System.out.println("Numeros da diagonal Principal");
		for (int i = 0; i < n; i++) {
			System.out.print(mat [i] [i] + " ");
		}
		System.out.println();
		System.out.println("=================================");
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat [i] [j] < 0 ) {
					count ++;
				}
			}
			
		}
		System.out.println("Numeros negativos: " + count );
		
		sc.close();

	}

}
