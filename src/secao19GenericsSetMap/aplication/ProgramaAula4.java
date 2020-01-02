package secao19GenericsSetMap.aplication;

import java.util.ArrayList;
import java.util.List;
import secao19GenericsSetMap.entitis.FigCirculo;
import secao19GenericsSetMap.entitis.FigRetangulo;
import secao19GenericsSetMap.entitis.InterfaceFigura;


public class ProgramaAula4 {

	public static void main(String[] args) {
	
		List<InterfaceFigura> myFiguras = new ArrayList<>();
		myFiguras.add(new FigRetangulo(3.0, 2.0));
		myFiguras.add(new FigCirculo(2.0));
		
		List<FigCirculo> myCiculos = new ArrayList<>();
		myCiculos.add(new FigCirculo(2.0));
		myCiculos.add(new FigCirculo(3.0));
		
		System.out.println("Total da area: " + totalArea(myCiculos));
	}
	
	public static double totalArea(List<? extends InterfaceFigura> list) {
		double soma = 0.0;
		for (InterfaceFigura fig : list) {
			soma += fig.area();
		}
		return soma;
	}
}
