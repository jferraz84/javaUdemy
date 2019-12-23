package secao18Interfaces.dispositivos;

public abstract class Dispositivo {

	public String serialNumero;

	public Dispositivo(String serialNumero) {
		this.serialNumero = serialNumero;
	}

	public String getSerialNumero() {
		return serialNumero;
	}

	public void setSerialNumero(String serialNumero) {
		this.serialNumero = serialNumero;
	}
	
	public abstract void processaDoc(String doc);
	
}
