package secao19GenericsSetMap.aplication;

import java.util.HashMap;
import java.util.Map;

import secao19GenericsSetMap.entitis.ProdutoMap;

public class ProgramaAula7Map {

	public static void main(String[] args) {
		
		/*//EXEMPLO
		Map<String, String> cookies = new TreeMap<>() ;
		
		cookies.put("username", "Maria" );
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone", "98126-3882");
		
		cookies.remove("email");
		cookies.put("fone", "98126-3881");
		
		System.out.println("Contem a chave: " + cookies.containsKey("fone"));
		System.out.println("Numero do Fone:  " + cookies.get("fone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Tamanho: " + cookies.size());
		
		System.out.println("Todos cookies: ");
		for (String Key : cookies.keySet()) {
			System.out.println(Key + ": " + cookies.get(Key));
		}*/

		Map<ProdutoMap, Double>  stok = new HashMap<>();
		
		ProdutoMap p1 = new ProdutoMap("Tv", 990.00);
		ProdutoMap p2 = new ProdutoMap("Notebook", 1200.00);
		ProdutoMap p3 = new ProdutoMap("Tablet", 400.00);
		
		stok.put(p1, 10000.0);
		stok.put(p2, 20000.0);
		stok.put(p3, 15000.0);
		
		ProdutoMap pm = new ProdutoMap("Tv", 990.00);
		System.out.println("Contem chave pm: " + stok.containsKey(pm));
	}

}
