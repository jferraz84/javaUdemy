package secao15Model.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import secao15Model.exceptions.DomainExceptions;

public class ReservaHotel {

	private int numeroQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservaHotel() {

	}

	public ReservaHotel(int numeroQuarto, Date dataEntrada, Date dataSaida) throws DomainExceptions {
		if (! dataSaida.after(dataEntrada)){
			throw new DomainExceptions("ERRO !! A data de saida deve ser posterior a data de entrada");
		}
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

	public void atualizaDatas(Date dataEntrada, Date dataSaida) throws DomainExceptions {	
		
		Date now = new Date();
		if ( dataEntrada.before(now) || dataSaida.before(now)){
			throw new DomainExceptions("Erro na Reserva: 'As datas de RESERVA devem ser datas futuras'");
		}
		if (! dataSaida.after(dataEntrada)){
			throw new DomainExceptions("ERRO !! A data de saida deve ser posterior a data de entrada");
		}
		
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;

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
