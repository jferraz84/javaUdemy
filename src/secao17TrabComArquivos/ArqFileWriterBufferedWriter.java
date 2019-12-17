package secao17TrabComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArqFileWriterBufferedWriter {

	public static void main(String[] args) {
		

		String[] lines = new String[] {"Bom dia ", "Boa tarde", "Boa noite"};
		
		String patch = "C:\\Windows\\Temp\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(patch, true))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
