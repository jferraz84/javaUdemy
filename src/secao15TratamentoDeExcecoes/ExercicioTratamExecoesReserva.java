package secao15TratamentoDeExcecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import secao15Model.Entidades.ReservaHotel;

public class ExercicioTratamExecoesReserva {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Numero do Quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de entrada ( dd/MM/yyyy ): ");
		Date dataEntrada = sdf.parse(sc.next());
		System.out.print("Data de saída ( dd/MM/yyyy ): ");
		Date dataSaida = sdf.parse(sc.next());
		
		if (!dataSaida.after(dataEntrada)) {
			System.out.println("Erro na Reserva: Data de entrada não pode ser superior data de saida");
		}
		else {
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
			
			/*Date now = new Date();
			if (dataEntrada.before(now) || dataSaida.before(now)) {
				System.out.println("Erro na Reserva: 'As datas de RESERVA devem ser datas futuras'");
			}
			else if (! dataSaida.after(dataEntrada)){
				System.out.println("");
			}*/
			
			String error = reservaHotel.atualizaDatas(dataEntrada, dataSaida);
			if (error != null) {
				System.out.println("ERRO ! " + error);
			}
			else {
				System.out.println(reservaHotel);
				System.out.println("|-----------------------------|");
				System.out.println("Atualizado com SUCESSO !!");
				
			}
		}
		
		
		sc.close();
		
	}

}
