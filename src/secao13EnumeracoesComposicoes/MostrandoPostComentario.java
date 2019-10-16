package secao13EnumeracoesComposicoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import secao13PacoteEntidades.Enums.Comentarios;
import secao13PacoteEntidades.Enums.Post;

public class MostrandoPostComentario {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		Comentarios c1 = new Comentarios("Tenha uma boa viajem !");
		Comentarios c2 = new Comentarios("Nossa que legal ");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"'Partindo para Natal-RN'", 
				"Vou visitar essa cidade Linda !!", 
				12);
		p1.addComentarios(c1);
		p1.addComentarios(c2);
		
		System.out.println(p1);
		System.out.println("--------------------------------");
		
		Comentarios c3 = new Comentarios("Tenha uma boa Noite !");
		Comentarios c4 = new Comentarios("Que Deus esteja contigo ");
		Post p2 = new Post(sdf.parse("15/09/2019 23:09:00"), 
				"'Boa noite meus amigos'", 
				"'Até amanhã brothers !!'", 
				52);
		p2.addComentarios(c3);
		p2.addComentarios(c4);
		
		System.out.println(p2);
		System.out.println("--------------------------------");
		
		sc.close();

	}

}
