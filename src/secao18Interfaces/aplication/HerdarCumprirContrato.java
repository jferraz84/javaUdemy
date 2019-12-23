package secao18Interfaces.aplication;


import secao18Interfaces.enums.Color;
import secao18Interfaces.model.entities.AbstractFugura;
import secao18Interfaces.model.entities.Circulo;
import secao18Interfaces.model.entities.Retangulo;

public class HerdarCumprirContrato {

	public static void main(String[] args) {
	
		AbstractFugura f1 = new Circulo(Color.BLACK, 2.0);
		AbstractFugura f2 = new Retangulo(Color.BLUE, 3.0, 4.0);
		
		System.out.println("Ciculo cor: " + f1.getColor());
		System.out.println("Ciculo area: " + String.format("%.3f", f1.area()));
		System.out.println("-----------------------------");
		System.out.println("Retangulo cor: " + f2.getColor());
		System.out.println("Retangulo area: " + String.format("%.3f", f2.area()));
		
	}

}
