package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Classroom;

public class ClassroomDao {

	private static final String JPA_UNIT_NAME = "ExamJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Classroom> selectAll() {
		@SuppressWarnings("unchecked")
		List<Classroom> classrooms = getEntityManager().createQuery("select c from Classroom c").getResultList();
		return classrooms;
	}

	public Classroom insert(Classroom c) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(c);
		getEntityManager().getTransaction().commit();
		return c;
	}
	
	public String getClassroomNatureByName(String name) {
		String nature = (String) getEntityManager().createQuery("select typeclassroom from Classroom c where c.name = ?1").setParameter(1, name).getSingleResult();
		return nature;
	}
	
	public Classroom getClassroomByName(String name) {
		Classroom c = (Classroom) getEntityManager().createQuery("select c from Classroom c where c.name = ?1").setParameter(1, name).getSingleResult();
		return c;
	}

}
