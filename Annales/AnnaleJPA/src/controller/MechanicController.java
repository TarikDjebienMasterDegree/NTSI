package controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import model.dao.MechanicDao;
import model.entity.Mechanic;

public class MechanicController {
	
	private MechanicDao mDao = new MechanicDao();
	private DataModel mechanics;
	private Mechanic newMechanic = new Mechanic();
	
	/**
	 * @return the mDao
	 */
	public MechanicDao getmDao() {
		return mDao;
	}
	/**
	 * @return the customers
	 */
	public DataModel getMechanics() {
		if(mechanics == null){
			mechanics = new ListDataModel();
			mechanics.setWrappedData(mDao.selectAll());
		}
		return mechanics;
	}
	
	/**
	 * @return the newMechanic
	 */
	public Mechanic getNewMechanic() {
		return newMechanic;
	}
	
	public String createMechanic() {
		mDao.insert(newMechanic);
		newMechanic = new Mechanic();
		mechanics.setWrappedData(mDao.selectAll());
		return "listMechanics";
	}
	
}
