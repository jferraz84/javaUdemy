package secoes234AptdaLingagemJavaConcBasico;

import java.util.Scanner;

public class OperadorBitWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;
		int n = sc.nextInt();
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		if ( (n & mask) != 0 ) {
			System.out.println("O sexto digito é Verdadeiro");
		} else {
			System.out.println("O sexto digito é Falso");
		}
		sc.close();
		
	}

}
