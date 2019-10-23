package secao14HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14Entidades.Circulo;
import secao14Entidades.Forma;
import secao14Entidades.Retangulo;
import secao14Entidades.enums.Color;

public class MetodosAbstratosLendoFiguras {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de FORMAS: ");
		int n = sc.nextInt();
		System.out.println("===============================");
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Digite os dados da figura # " + i);
			System.out.print("A forma é retangulo ou circulo? ( R, C ) = ");
			char  ch = sc.next().charAt(0);
			System.out.println("Qual é a cor Da forma");
			System.out.print("(BLACK - BLUE - RED) = ");
			Color color = Color.valueOf(sc.next());
			
			if (ch == 'R') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, largura, altura));
				
			} else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(color, raio));
			   }
			System.out.println("==========================================");
			
			}
		
		    System.out.println("Area das formas: ");
		    for (Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
			
		}
		
		sc.close();
	}

}
