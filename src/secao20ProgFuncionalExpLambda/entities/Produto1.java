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
	
	//Aula 03 PREDICATE
	/*public static boolean staticProdutoPredicate(Produto1 p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProdutoPredicate() {
		return price >= 100.0;
	}*/
	
	// //Aula 04 CONSUMER
	public static void staticPriceUpdate(Produto1 p ) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		// setPrice(getPrice() * 1.1);   OU ...
		price = price *1.1;
	}
	

	@Override  
	public String toString() {
		return "Produto: "+ name + ",  Preco: " + String.format("%.2f", price);
	}

	
}
