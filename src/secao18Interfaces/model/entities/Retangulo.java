package secao18Interfaces.model.entities;

import secao18Interfaces.enums.Color;

public class Retangulo extends AbstractFugura{

	private double altura;
	private double largura;

	public Retangulo(Color color, double altura, double largura) {
		super(color);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double area() {
		return altura * largura;
	}
	
	
}
