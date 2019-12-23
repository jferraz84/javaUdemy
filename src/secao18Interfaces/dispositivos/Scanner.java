package secao18Interfaces.dispositivos;

public class Scanner extends Dispositivo {

	public Scanner(String serialNumero) {
		super(serialNumero);
	}
	
	@Override
	public void processaDoc(String doc) {
		System.out.println("Digitando processo: " + doc);
	}

	public String scan () {
		return "Conteúdo digitalizado";
	}
	

}
