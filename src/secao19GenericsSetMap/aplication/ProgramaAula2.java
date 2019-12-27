package secao19GenericsSetMap.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import secao19GenericsSetMap.entitis.Produto;
import secao19GenericsSetMap.services.ServicoCalcular;

public class ProgramaAula2 {

	public static void main(String[] args) {


		List<Produto> list = new ArrayList<>();
		
		String patch = "C:\\Windows\\Temp\\in.txt";

		try  (BufferedReader br = new BufferedReader(new FileReader(patch))){ 
			
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
		    Produto x = ServicoCalcular.max(list);
			System.out.println("Max: ");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		
		}
	}

}
