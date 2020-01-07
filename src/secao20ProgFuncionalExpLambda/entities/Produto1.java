package secao20ProgFuncionalExpLambda.entities;

public class Produto1 {

	private String name;
	private Double price;
	
	public Produto1(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProdutoPredicate(Produto1 p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProdutoPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return "Produto1  name = " + name + ",\nprice = " + price;
	}

	
}
