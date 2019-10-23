package secao14Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeFabricação;

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricação) {
		super(nome, preco);
		this.dataDeFabricação = dataDeFabricação;
	}

	public Date getDataDeFabricação() {
		return dataDeFabricação;
	}

	public void setDataDeFabricação(Date dataDeFabricação) {
		this.dataDeFabricação = dataDeFabricação;
	}
	
	@Override
	public String etiquetaDePreco() {
		return getNome()
				+ " (usado) R$ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de Fabricação: "
				+ sdf.format(dataDeFabricação)
				+ ")";
	}

}
