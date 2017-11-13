package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.entity.Customer;

public class CustomerDao {

	private static final String JPA_UNIT_NAME = "AnnaleJPA";

	private EntityManager entityManager;

	protected EntityManager getEntityManager(){
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	public List<Customer> selectAll() {
		@SuppressWarnings("unchecked")
		List<Customer> customers = getEntityManager().createQuery("select c from Customer c").getResultList();
		return customers;
	}

	public Customer insert(Customer c) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(c);
		getEntityManager().getTransaction().commit();
		return c;
	}

	public void delete(Customer c) {
		getEntityManager().getTransaction().begin();
		c = getEntityManager().merge(c);
		getEntityManager().remove(c);
		getEntityManager().getTransaction().commit();
	}

	public Customer update(Customer c) {
		getEntityManager().getTransaction().begin();
		c = getEntityManager().merge(c);
		getEntityManager().getTransaction().commit();
		return c;
	}

	public Customer getCustomerByName(String name) {
		Customer c = (Customer) getEntityManager().createQuery("select c from Customer c where c.name = ?1").setParameter(1, name).getSingleResult();
		return c;
	}

}
