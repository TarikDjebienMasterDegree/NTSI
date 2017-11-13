package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import model.dao.TeacherDao;
import model.entity.Teacher;

public class TeacherConverter implements Converter {

	private TeacherDao tDao;
	
	public TeacherConverter() {
		tDao = new TeacherDao();
	}
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return tDao.getTeacherByName(value);
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Teacher teacher = (Teacher) value;
		
		return teacher.getName();
	}

}
