package Se��o3IntroProgrOrientObjetos;

public class Produto {

	public String name;
	public double price;
	public int quantity;

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

