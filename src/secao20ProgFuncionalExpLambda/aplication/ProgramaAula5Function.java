package secao20ProgFuncionalExpLambda.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import secao20ProgFuncionalExpLambda.entities.Produto1;
import secao20ProgFuncionalExpLambda.util.UperCasename;

public class ProgramaAula5Function {

	public static void main(String[] args) {
	
Locale.setDefault(Locale.US);
		
		List<Produto1> list = new ArrayList<>();
		list.add(new Produto1("Tv", 900.00));
		list.add(new Produto1("Mouse", 50.00));
		list.add(new Produto1("Tablet", 350.50));
		list.add(new Produto1("HD Case", 80.90));
		
		
		/*Implementação da interface
		List<String> names = list.stream().map(new UperCasename()).collect(Collectors.toList());
		names.forEach(System.out::println);*/
		
		/*• Reference method com método estático
		List<String> names = list.stream().map(Produto1::staticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);*/
		
		/*• Reference method com método não estático
		List<String> names = list.stream().map(Produto1::nonStaticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);*/
		
		/*• Expressão lambda declarada
		Function<Produto1, String> func = p -> p.getName().toUpperCase(); 
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		names.forEach(System.out::println);*/
		
		//• Expressão lambda inline 
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}

}
