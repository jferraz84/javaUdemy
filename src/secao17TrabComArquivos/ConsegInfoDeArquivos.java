package secao17TrabComArquivos;

import java.io.File;
import java.util.Scanner;

public class ConsegInfoDeArquivos {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strpath = sc.nextLine();
		File path = new File(strpath);
		
		
		System.out.println("Buscando nome(getName):  "+ path.getName());
		System.out.println("Buscando caminho do arquivo(getParent):  " + path.getParent());
		System.out.println("Buscando pasta do arquivo(getPath):  " + path.getPath());
		
		sc.close();
	}

}
