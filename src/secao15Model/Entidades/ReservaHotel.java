package secao15Model.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaHotel {

	private int numeroQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservaHotel() {

	}

	public ReservaHotel(int numeroQuarto, Date dataEntrada, Date dataSaida) {
		this.numeroQuarto = numeroQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public long duracao() {
		long diff = dataSaida.getTime() - dataEntrada.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public String atualizaDatas(Date dataEntrada, Date dataSaida) {	
		Date now = new Date();
		if ( dataEntrada.before(now) || dataSaida.before(now)){
			return "Erro na Reserva: 'As datas de RESERVA devem ser datas futuras'";
		}
		if (! dataSaida.after(dataEntrada)){
			return "ERRO !! A data de saida deve ser posterior a data de entrada";
		}
		
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		return null;

	}

	@Override
	public String toString() {
		System.out.println("|-------Hotel Beira Mar-------|");
		return "|======Reserva Hotel !!!======|\n" 
				  +"|Numero Quarto =  " 
	              + numeroQuarto +"        |"
	              + "\n|Data Entrada  =  " 
				  + sdf.format(dataEntrada)+"  |"
				  + "\n|Data Saida    =  "  
				  + sdf.format(dataSaida)+ "  |"
				  + "\n|Total de      =  "
				  + duracao()
				  + " noites    |";
        
	}

}
