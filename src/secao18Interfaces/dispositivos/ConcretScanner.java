package secao18Interfaces.dispositivos;

public class ConcretScanner  extends Dispositivo implements ScannerInter{

	public ConcretScanner(String serialNumero) {
		super(serialNumero);
	}
	
	@Override
	public void processaDoc(String doc) {
		System.out.println("Digitando processo: " + doc);
	}

	@Override
	public String scan () {
		return "Conteúdo digitalizado";
	}

}
