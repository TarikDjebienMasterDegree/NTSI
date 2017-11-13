package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Person;

public class StudentDao {

	private static final String JPA_UNIT_NAME = "ExamJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Person> selectAll() {
		@SuppressWarnings("unchecked")
		List<Person> students = getEntityManager().createQuery("select p from Person p").getResultList();
		return students;
	}

	public Person insert(Person p) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(p);
		getEntityManager().getTransaction().commit();
		return p;
	}
	
	public Person getStudentByName(String name) {
		Person p = (Person) getEntityManager().createQuery("select p from Person p where p.name = ?1").setParameter(1, name).getSingleResult();
		return p;
	}

}
