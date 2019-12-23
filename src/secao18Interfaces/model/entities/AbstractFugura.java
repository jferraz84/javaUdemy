package secao18Interfaces.model.entities;

import secao18Interfaces.enums.Color;

public abstract class AbstractFugura implements FiguraInter{
	
	private Color color;

	public AbstractFugura(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
