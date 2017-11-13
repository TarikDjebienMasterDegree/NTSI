package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import model.dao.CustomerDao;
import model.entity.Customer;

public class CustomerConverter implements Converter {

	private CustomerDao customerDao = new CustomerDao();

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String Name) {
		Customer c = getCustomerDao().getCustomerByName(Name);
		return c;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		String val = null;
		try{
			Customer c = (Customer) value;
			val = c.getName();
		}catch(Throwable ex){
			throw new ConverterException();
		}
		return val;
	}

	/**
	 * @return the customerDao
	 */
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

}
