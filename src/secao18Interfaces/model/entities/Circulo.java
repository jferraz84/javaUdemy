package secao18Interfaces.model.entities;

import secao18Interfaces.enums.Color;

public class Circulo extends AbstractFugura{

	private Double raio;

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaiz() {
		return raio;
	}

	public void setRaiz(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	
	
}
