package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Booking;

public class BookingDao {

	private static final String JPA_UNIT_NAME = "ExamJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Booking> selectAll() {
		@SuppressWarnings("unchecked")
		List<Booking> bookings = getEntityManager().createQuery("select b from Booking b").getResultList();
		return bookings;
	}

	public Booking insert(Booking b) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(b);
		getEntityManager().getTransaction().commit();
		return b;
	}

}
