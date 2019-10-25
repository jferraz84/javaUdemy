package secao15TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaDeChamadaMetodo {

	public static void main(String[] args) {

		metodo1();
		System.out.println("Fim do Programa !!");

	}

	public static void metodo1() {
		System.out.println("*** M�todo 1 Come�ou *** ");

		metodo2();

		System.out.println("*** M�todo 1 Terminou *** ");
	}

	public static void metodo2() {

		System.out.println("*** M�todo 2 Come�ou *** ");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Possi��o inv�lida");
			e.printStackTrace();
			sc.next();
			
		} catch (InputMismatchException e) {
			System.out.println("S� � permitido numeros !!");
		}
		sc.close();
		System.out.println("*** M�todo 2 TERMINOU *** ");
	}
}
