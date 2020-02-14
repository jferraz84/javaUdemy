package secao24JavaEE.MapeamentoOBJ.Relac.JPA.aplication;

import secao24JavaEE.MapeamentoOBJ.Relac.JPA.dominio.Pessoa;

public class ProgramaMain {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Jorge Ferraz", "jferraz@cpqd.com.br");
		Pessoa p2 = new Pessoa(1, "Aline Ferraz", "aferraz@cpqd.com.br");
		Pessoa p3 = new Pessoa(1, "Heloa Ferraz", "hferraz@cpqd.com.br");
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);		
		
	}

}
