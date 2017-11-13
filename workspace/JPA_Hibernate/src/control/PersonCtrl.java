package control;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import model.dao.PersonDao;
import model.dto.Person;

public class PersonCtrl {
	
	private PersonDao pDao = new PersonDao();
	private DataModel persons;
	private Person newPerson = new Person();
	private Person editPerson;
	
	public Person getEditPerson() {
		return editPerson;
	}
	
	public Person getNewPerson() {
		return newPerson;
	}

	public DataModel getPersons() {
		if(persons == null) {
			persons = new ListDataModel();
			persons.setWrappedData(pDao.selectAll());
		}
		return persons;
	}
	
	public String createPerson() {
		pDao.insert(newPerson);
		newPerson = new Person();
		persons.setWrappedData(pDao.selectAll());
		return "list";
	}
	
	public String deletePerson() {
		Person p = (Person) persons.getRowData();
		pDao.delete(p);
		persons.setWrappedData(pDao.selectAll());
		return null;
	}
	
	public String editerPerson() {
		editPerson = (Person) persons.getRowData();
		return "edit";
	}
	
	public String updatePerson() {
		pDao.update(editPerson);
		persons.setWrappedData(pDao.selectAll());
		return "update";
	}
	
}
