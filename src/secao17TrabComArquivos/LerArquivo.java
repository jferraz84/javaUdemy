package secao17TrabComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Windows\\Temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			
		}

	}

}
