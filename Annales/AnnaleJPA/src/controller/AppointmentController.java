package controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.model.SelectItem;

import model.dao.AppointmentDao;
import model.dao.CustomerDao;
import model.entity.Appointment;
import model.entity.Customer;

public class AppointmentController {
	
	private AppointmentDao aDao = new AppointmentDao();
	private CustomerDao cDao = new CustomerDao();
	private Appointment newAppointment = new Appointment();
	private Collection<SelectItem> customersSelectable = new ArrayList<SelectItem>();
	
	/**
	 * @return the aDao
	 */
	public AppointmentDao getaDao() {
		return aDao;
	}
	
	/**
	 * @return the newAppointment
	 */
	public Appointment getNewAppointment() {
		return newAppointment;
	}
	
	public String goToStep2() {
		return "goToStep2";
	}
	
	public String goToStep3() {
		return "goToStep3";
	}
	
	public String goToStep4() {
		return "goToStep4";
	}
	
	public String goToStep5() {
		return "goToStep5";
	}
	
	public String goToHome() {
		return "goToHome";
	}
	
	public String createAppointment() {
		aDao.insert(newAppointment);
		newAppointment = new Appointment();
		return "home";
	}

	/**
	 * @return the customersSelectable
	 */
	public Collection<SelectItem> getCustomersSelectable() {
		customersSelectable = new ArrayList<SelectItem>();
		for(Customer c : cDao.selectAll()){
			customersSelectable.add(new SelectItem(c, c.getName()));
		}
		return customersSelectable;
	}

}
