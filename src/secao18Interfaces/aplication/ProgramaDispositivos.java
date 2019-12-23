package secao18Interfaces.aplication;


import secao18Interfaces.dispositivos.ComboDispositivos;
import secao18Interfaces.dispositivos.Impressora;
import secao18Interfaces.dispositivos.Scanner;

public class ProgramaDispositivos {

	public static void main(String[] args) {
		
		System.out.println("COMPORTAMENTO DA IMPRESSORA !!");
		Impressora p = new Impressora("1984");
		p.processaDoc("My Letter");
		p.mostre("My Letter");
		System.out.println("-----------------------");

		System.out.println("COMPORTAMENTO DO SCANNER !!");
		Scanner s = new Scanner("2003");
		s.processaDoc("My e-mail");
		System.out.println("Resultado do Scan: " + s.scan());
		System.out.println("-----------------------");
		
		System.out.println("COMPORTAMENTO DO COMBO !!");
		ComboDispositivos c = new ComboDispositivos("2019");
		c.processaDoc("Minha Disertação");
		c.mostre("Minha Disertação");
		System.out.println("Scan result: " + c.scan());
	}
	

}
