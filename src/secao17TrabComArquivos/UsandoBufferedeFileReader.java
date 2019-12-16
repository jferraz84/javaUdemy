package secao17TrabComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsandoBufferedeFileReader {

	public static void main(String[] args) {
		
		// TESTE BUFFERED E FILE READER
		/*String patch = "C:\\Windows\\Temp\\in.txt";

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(patch);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		// TESTANDO FUNÇÃO TRY-WITH-RESOURCES
		String patch = "C:\\Windows\\Temp\\in.txt";

		try  (BufferedReader br = new BufferedReader(new FileReader(patch))){ 
			
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		
		}
		
	}

}
