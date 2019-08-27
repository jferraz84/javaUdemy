package Seção3IntroProgrOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		
		System.out.println("Enter product data");
		System.out.println("Enter Name the Product");
		System.out.println("Name : ");
		produto.name = sc.nextLine();
		System.out.println("Price : R$  ");
		produto.price = sc.nextDouble();
		System.out.println("Quantity :  ");
		produto.quantity = sc.nextInt();
		char resp1;
		char resp2;
		
		do {
		System.out.println("-------------------------------");
		System.out.println("Updated --------------------");
		System.out.println("Product data : " + produto);
		System.out.println("-------------------------------");
		System.out.println("Do you want to add or remove a product ? Add/Rem ");
		resp1 = sc.next().charAt(0);
	
		if (resp1 == 'a' ) {
			System.out.println("Enter the number of products to be added in stock:  ");
			int quantity = sc.nextInt();
			produto.addProducts(quantity);
			System.out.println("-------------------------------");
			System.out.println("Update data: " + produto);
			System.out.println("-------------------------------");
			System.out.println("Product data : " + produto);
			System.out.println("-------------------------------");
		} else {
			System.out.println("Enter the number of products to be removed in stock:  ");
			int quantity = sc.nextInt();
			produto.removeProducts(quantity);
			System.out.println("--------------------------------");
			
			System.out.println("Update data: " + produto);
			System.out.println("-------------------------------");
			System.out.println("Product data : " + produto);
			System.out.println("-------------------------------");
		}
		System.out.println("Do you wish to continue ? S/N ");
		resp2 = sc.next().charAt(0);
		
		} while (resp2 != 'n');
		
		System.out.println("Fim do Programa !");
		sc.close();

	}

}
