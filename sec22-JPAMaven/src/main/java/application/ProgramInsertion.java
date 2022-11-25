package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.entities.People;

public class ProgramInsertion {

	public static void main(String[] args) {
		
		People p1 = new People(null, "Carlos da Silva", "carlos@gmail.com");
		People p2 = new People(null, "Juiana da Silva", "juliana@gmail.com");
		People p3 = new People(null, "Alex da Silva", "alex@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec22-JPAMaven");
		EntityManager em = emf.createEntityManager();
		
		// INSERINDO OBJETOS NO BANCO DE DADOS
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Processo concluído!");
		em.close();
		emf.close();
		
	}
}
