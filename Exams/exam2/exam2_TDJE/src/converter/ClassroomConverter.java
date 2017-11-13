package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import model.dao.ClassroomDao;
import model.entity.Classroom;

public class ClassroomConverter implements Converter {

	private ClassroomDao cDao;
	
	public ClassroomConverter() {
		cDao = new ClassroomDao();
	}
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return cDao.getClassroomByName(value);
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Classroom classroom = (Classroom) value;
		
		return classroom.getName();
	}

}
