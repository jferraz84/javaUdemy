package secao4ConstrutSobreCarEncapsul;

public class Produto {

	public String name;
	public double price;
	public int quantity;
	
	

	public Produto(String name, double price, int quantity) {
	
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {

		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
				+ " ,  R$  "
				+ String.format("%.2f%n", price )
				+ " ,  "
				+ quantity
				+ " unity ,  Total : R$ " 
				+ String.format("%.2f%n", totalValueStock());
	}

}

