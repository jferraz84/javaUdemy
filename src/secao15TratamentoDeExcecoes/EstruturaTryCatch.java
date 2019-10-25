package secao15TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Possição inválida");
		} catch (InputMismatchException e) {
			System.out.println("Só é permitido numeros !!");
		}
		
		System.out.println("Fim do Programa !!");
		sc.close();

	}

}
