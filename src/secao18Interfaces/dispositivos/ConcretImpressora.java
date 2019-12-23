package secao18Interfaces.dispositivos;

public class ConcretImpressora extends Dispositivo implements ImpressoraInter{

	public ConcretImpressora(String serialNumero) {
		super(serialNumero);
		
	}

	@Override
	public void processaDoc(String doc) {
		System.out.println("Mostre o Processo: " + doc);
	}

	@Override
	public void mostre(String doc) {
		System.out.println("Mostrando: " + doc);
	}
}
