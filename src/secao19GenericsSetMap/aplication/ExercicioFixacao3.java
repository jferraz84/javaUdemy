package secao19GenericsSetMap.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioFixacao3 {

	public static void main(String[] args) throws ParseException{
	
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Digite o caminho do Arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new  FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if (votos.containsKey(name)) {
					int votosFavor = votos.get(name);
					votos.put(name, count + votosFavor);
					
				}
				else {
					
					votos.put(name, count);
					
				}
				
				line = br.readLine();
			}
			
			for (String Key : votos.keySet()) {
				System.out.println(Key + ": " + votos.get(Key));
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
