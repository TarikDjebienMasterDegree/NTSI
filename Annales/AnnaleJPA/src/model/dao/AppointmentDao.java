package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Appointment;

public class AppointmentDao {

	private static final String JPA_UNIT_NAME = "AnnaleJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Appointment> selectAll() {
		@SuppressWarnings("unchecked")
		List<Appointment> appointments = getEntityManager().createQuery("select a from Appointment a").getResultList();
		return appointments;
	}

	public Appointment insert(Appointment a) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(a);
		getEntityManager().getTransaction().commit();
		return a;
	}

}
