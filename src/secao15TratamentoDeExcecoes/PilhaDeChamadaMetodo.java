package secao15TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaDeChamadaMetodo {

	public static void main(String[] args) {

		metodo1();
		System.out.println("Fim do Programa !!");

	}

	public static void metodo1() {
		System.out.println("*** Método 1 Começou *** ");

		metodo2();

		System.out.println("*** Método 1 Terminou *** ");
	}

	public static void metodo2() {

		System.out.println("*** Método 2 Começou *** ");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Possição inválida");
			e.printStackTrace();
			sc.next();
			
		} catch (InputMismatchException e) {
			System.out.println("Só é permitido numeros !!");
		}
		sc.close();
		System.out.println("*** Método 2 TERMINOU *** ");
	}
}
