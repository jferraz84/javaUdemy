package secao20ProgFuncionalExpLambda.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import secao20ProgFuncionalExpLambda.entities.Produto1;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do Arquivo: ");
		String arq = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(arq))){
			
			List<Produto1> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto1(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			//PIPELINE DA MEDIA
			double med = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x , y) -> x + y) / list.size();
			System.out.println("Média de preço: " + med);		
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> name = list.stream()
					.filter(p -> p.getPrice() < med)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			name.forEach(System.out::println);
			
			
			
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
			
		}
		
		sc.close();
	}

}
