package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import model.dao.StudentDao;
import model.entity.Person;


public class PersonConverter implements Converter {

	private StudentDao sDao;
	
	public PersonConverter() {
		sDao = new StudentDao();
	}
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return sDao.getStudentByName(value);
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Person student = (Person) value;
		
		return student.getName();
	}

}
