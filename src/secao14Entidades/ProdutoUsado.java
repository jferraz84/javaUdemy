package secao14Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeFabrica��o;

	public ProdutoUsado(String nome, Double preco, Date dataDeFabrica��o) {
		super(nome, preco);
		this.dataDeFabrica��o = dataDeFabrica��o;
	}

	public Date getDataDeFabrica��o() {
		return dataDeFabrica��o;
	}

	public void setDataDeFabrica��o(Date dataDeFabrica��o) {
		this.dataDeFabrica��o = dataDeFabrica��o;
	}
	
	@Override
	public String etiquetaDePreco() {
		return getNome()
				+ " (usado) R$ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de Fabrica��o: "
				+ sdf.format(dataDeFabrica��o)
				+ ")";
	}

}
