package secao4ConstrutSobreCarEncapsul;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter product data");
				System.out.println("Enter Name the Product");
				System.out.println("Name : ");
				String name = sc.nextLine();
				System.out.println("Price : R$  ");
				double price = sc.nextDouble();
				System.out.println("Quantity :  ");
				int  quantity = sc.nextInt();
				Produto produto = new Produto(name, price, quantity);
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
					quantity = sc.nextInt();
					produto.addProducts(quantity);
					System.out.println("-------------------------------");
					System.out.println("Update data: " + produto);
					System.out.println("-------------------------------");
					System.out.println("Product data : " + produto);
					System.out.println("-------------------------------");
				} else {
					System.out.println("Enter the number of products to be removed in stock:  ");
					quantity = sc.nextInt();
					produto.removeProducts(quantity);
					System.out.println("--------------------------------");
					
					/*System.out.println("Update data: " + produto);
					System.out.println("-------------------------------");
					System.out.println("Product data : " + produto);
					System.out.println("-------------------------------");*/
				}
				System.out.println("Do you wish to continue ? S/N ");
				resp2 = sc.next().charAt(0);
				
				} while (resp2 != 'n');
				System.out.println("-------------------------------");
				System.out.println("Updated --------------------");
				System.out.println("Product data : " + produto);
				System.out.println("-------------------------------");
				
				System.out.println("Fim do Programa !");
				sc.close();

			}

}


