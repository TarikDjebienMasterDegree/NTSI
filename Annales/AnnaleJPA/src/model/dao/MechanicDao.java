package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Mechanic;

public class MechanicDao {

	private static final String JPA_UNIT_NAME = "AnnaleJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Mechanic> selectAll() {
		@SuppressWarnings("unchecked")
		List<Mechanic> mechanics = getEntityManager().createQuery("select m from Mechanic m").getResultList();
		return mechanics;
	}

	public Mechanic insert(Mechanic m) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(m);
		getEntityManager().getTransaction().commit();
		return m;
	}

}
