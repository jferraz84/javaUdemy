package secao18Interfaces.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import secao18Interfaces.model.entities.Funcionario;




public class ProgramaCompare {

	public static void main(String[] args) {
		

		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\Windows\\Temp\\in.txt";
		
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] fields = funcionarioCsv.split(",");
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario emp : list) {
				System.out.println(emp.getNome() + ", " + emp.getSalario());
			}
		
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
