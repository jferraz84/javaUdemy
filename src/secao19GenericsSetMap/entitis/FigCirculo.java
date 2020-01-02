package secao19GenericsSetMap.entitis;

public class FigCirculo implements InterfaceFigura{

	private double radius;

	public FigCirculo(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	
}
