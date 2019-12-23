package secao18Interfaces.dispositivos;

public class ComboDispositivos extends Dispositivo implements ScannerInter, ImpressoraInter {
	
	public ComboDispositivos(String serialNUmero) {
		super(serialNUmero);
	}

	@Override
	public void mostre(String doc) {
		System.out.println("Combo Printing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan resultado";
	}

	@Override
	public void processaDoc(String doc) {
		System.out.println("Combo processo: " + doc);
	}

}
