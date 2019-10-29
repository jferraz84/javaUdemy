package secao15TratamentoDeExcecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import secao15Model.Entidades.ReservaHotel;
import secao15Model.exceptions.DomainExceptions;

public class ExercicioTratamExecoesReserva {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			System.out.println("Numero do Quarto: ");
			int numero = sc.nextInt();
			System.out.print("Data de entrada ( dd/MM/yyyy ): ");
			Date dataEntrada = sdf.parse(sc.next());
			System.out.print("Data de saída ( dd/MM/yyyy ): ");
			Date dataSaida = sdf.parse(sc.next());
			
			
			
			ReservaHotel reservaHotel = new ReservaHotel(numero, dataEntrada, dataSaida);
			System.out.println(reservaHotel);
			System.out.println("|-----------------------------|");
			System.out.println("Reserva realizada com SUCESSO !!");
			
			System.out.println("===================================================");
			System.out.println("Entre com os dados para atualizar a reserva: ");
			System.out.print("Data de entrada ( dd/MM/yyyy ): ");
			dataEntrada = sdf.parse(sc.next());
			System.out.print("Data de saída ( dd/MM/yyyy ): ");
			dataSaida = sdf.parse(sc.next());
			System.out.println("----------------------------");
			
		    reservaHotel.atualizaDatas(dataEntrada, dataSaida);
			
				System.out.println(reservaHotel);
				System.out.println("|-----------------------------|");
				System.out.println("Atualizado com SUCESSO !!");
		
		}
		catch (ParseException e) {
			System.out.println("Data Inválida !!");
		}
		catch (DomainExceptions e) {
			System.out.println(e.getMessage() );
		}
		
		sc.close();
		
	}

}
