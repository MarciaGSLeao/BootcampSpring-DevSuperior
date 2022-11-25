package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.entities.People;

public class ProgramDeleting {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec22-JPAMaven");
		EntityManager em = emf.createEntityManager();
		
		// PARA SER POSSÍVEL EXCLUIR UM REGISTRO DO BANCO DE DADOS É NECESSÁRIO CONSULTAR OS DADOS NO BANCO DE DADOS
		// PARA QUE O REGISTRO SEJA CAPTURADO E TRANSFORMADO EM UM OBJETO MONITORADO PELO JPA.
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
