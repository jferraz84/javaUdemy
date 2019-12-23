package secao18Interfaces.dispositivos;

public class Impressora extends Dispositivo{

	public Impressora(String serialNumero) {
		super(serialNumero);
		
	}

	@Override
	public void processaDoc(String doc) {
		System.out.println("Mostre o Processo: " + doc);
	}

	public void mostre(String doc) {
		System.out.println("Mostrando: " + doc);
	}
	
}
