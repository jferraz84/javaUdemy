package secao13PacoteEntidades.Enums;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido> items = new ArrayList<>();	
	

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItems() {
		return items;
	}

	public void addItem(ItemPedido item) {
		items.add(item);

	}

	public void removeItem(ItemPedido item) {
		items.remove(item);

	}
	
	public double total() {
		double soma = 0.0;

		for (ItemPedido item : items) {
			soma += item.subTotal();
		}

		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido : ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Ordem dos pedidos: \n");
		
		for (ItemPedido item : items) {
			sb.append(item + "\n");
		}
		
		sb.append("Preço Total: ");
		sb.append(String.format(" %.2f" , total()));
		return sb.toString();
		
	}
	
	
}
