package secao19GenericsSetMap.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import secao19GenericsSetMap.entitis.LogEntry;

public class ExercicioFixacaoSecao19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date momento = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, momento));
				
				line = br.readLine();
			}
			System.out.println("Total de usuarios: " +set.size());
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();

	}

}
