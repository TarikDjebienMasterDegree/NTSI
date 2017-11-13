package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Teacher;


public class TeacherDao {

	private static final String JPA_UNIT_NAME = "ExamJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Teacher> selectAll() {
		@SuppressWarnings("unchecked")
		List<Teacher> teachers = getEntityManager().createQuery("select t from Teacher t").getResultList();
		return teachers;
	}

	public Teacher insert(Teacher t) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(t);
		getEntityManager().getTransaction().commit();
		return t;
	}

	public void delete(Teacher t) {
		getEntityManager().getTransaction().begin();
		t = getEntityManager().merge(t);
		getEntityManager().remove(t);
		getEntityManager().getTransaction().commit();
	}

	public Teacher update(Teacher t) {
		getEntityManager().getTransaction().begin();
		t = getEntityManager().merge(t);
		getEntityManager().getTransaction().commit();
		return t;
	}

	public Teacher getTeacherByName(String name) {
		Teacher t = (Teacher) getEntityManager().createQuery("select t from Teacher t where t.name = ?1").setParameter(1, name).getSingleResult();
		return t;
	}

}
