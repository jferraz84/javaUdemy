package secao13EnumeracoesComposicoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao13PacoteEntidades.Enums.Cliente;
import secao13PacoteEntidades.Enums.ItemPedido;
import secao13PacoteEntidades.Enums.Pedido;
import secao13PacoteEntidades.Enums.Produto;
import secao13PacoteEntidades.Enums.StatusPedido;

public class ExercicioFixacaoOrdemDePedido {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNasc = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNasc);
		
		System.out.println("Digite os Dados do pedido: ");
		System.out.println("Status do Pedido: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos itens para este pedido ? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do item #" + i);
			System.out.println("Nome do Produto: ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			System.out.println("Preço do Produto: ");
			double produtoPreco = sc.nextDouble();
			
			Produto produto = new Produto(produtoNome, produtoPreco);
			
			System.out.println("Quantidade do Produto: ");
			int quantidade = sc.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(quantidade, produtoPreco, produto);
			
			pedido.addItem(itemPedido);
			
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Resumo do Pedido");
		System.out.println(pedido);
		
		sc.close();
	}

}
