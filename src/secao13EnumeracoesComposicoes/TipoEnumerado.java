package secao13EnumeracoesComposicoes;

import java.util.Date;

import secao13PacoteEntidades.Enums.OrderStatus;

public class TipoEnumerado {
	
	public static void main(String[] args) {
		
		Pedidos pedido = new Pedidos(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
	

}
