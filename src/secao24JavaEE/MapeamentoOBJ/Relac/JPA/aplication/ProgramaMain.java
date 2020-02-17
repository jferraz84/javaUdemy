package secao24JavaEE.MapeamentoOBJ.Relac.JPA.aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import secao24JavaEE.MapeamentoOBJ.Relac.JPA.dominio.Pessoa;

public class ProgramaMain {

	public static void main(String[] args) {
		
		/*Pessoa pj = new Pessoa(null, "Jorge Ferraz", "jferraz@cpqd.com.br");
		Pessoa pa = new Pessoa(null, "Aline Ferraz", "aferraz@cpqd.com.br");
		Pessoa ph = new Pessoa(null, "Heloa Ferraz", "hferraz@cpqd.com.br");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		Pessoa p = em.find(Pessoa.class, 6);
		
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		/*em.getTransaction().begin();
		em.persist(pj);
		em.persist(pa);
		em.persist(ph);
		em.getTransaction().commit();*/
		
		System.out.println("Pronto");
		em.close();
		emf.close();
	}

}
