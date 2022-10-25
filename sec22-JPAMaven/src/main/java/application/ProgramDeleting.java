package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.entities.People;

public class ProgramDeleting {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec22-JPAMaven");
		EntityManager em = emf.createEntityManager();
		
		// CONSULTANDO OS DADOS DO BANCO DE DADOS
		People person = em.find(People.class, 1);
		System.out.println(person);
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		System.out.println("Registro excluído com sucesso!");
		
		em.close();
		emf.close();
	}
}
