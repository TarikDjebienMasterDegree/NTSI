package controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import model.dao.CustomerDao;
import model.entity.Customer;

public class CustomerController {
	
	private CustomerDao cDao = new CustomerDao();
	private DataModel customers;
	private Customer newCustomer = new Customer();
	private Customer editCustomer;
	
	/**
	 * @return the cDao
	 */
	public CustomerDao getcDao() {
		return cDao;
	}
	/**
	 * @return the customers
	 */
	public DataModel getCustomers() {
		if(customers == null){
			customers = new ListDataModel();
			customers.setWrappedData(cDao.selectAll());
		}
		return customers;
	}
	/**
	 * @return the newCustomer
	 */
	public Customer getNewCustomer() {
		return newCustomer;
	}
	/**
	 * @return the editCustomer
	 */
	public Customer getEditCustomer() {
		return editCustomer;
	}
	
	public String createCustomer() {
		cDao.insert(newCustomer);
		newCustomer = new Customer();
		customers.setWrappedData(cDao.selectAll());
		return "listCustomers";
	}
	
	public String deleteCustomer() {
		Customer c = (Customer) customers.getRowData();
		cDao.delete(c);
		customers.setWrappedData(cDao.selectAll());
		return null;
	}
	
	public String editerCustomer() {
		editCustomer = (Customer) customers.getRowData();
		return "editCustomer";
	}
	
	public String updateCustomer() {
		cDao.update(editCustomer);
		customers.setWrappedData(cDao.selectAll());
		return "updateCustomer";
	}
	
}
