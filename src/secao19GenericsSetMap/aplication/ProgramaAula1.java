package secao19GenericsSetMap.aplication;

import java.util.Scanner;

import secao19GenericsSetMap.services.ServicoImpressao;

public class ProgramaAula1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//PODENDO AGORA A LISTA SER 'INTEGER' OU 'STRING'
		ServicoImpressao<Integer> si = new ServicoImpressao<>();
		
		System.out.println("Quantos valores vc vai digitar ? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			si.addValue(value);
		}
		
		si.print();
		System.out.println("Primeiro numero: " + si.primeiro());
		
		sc.close();

	}

}
