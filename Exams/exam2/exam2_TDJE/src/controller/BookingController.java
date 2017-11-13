package controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.model.SelectItem;

import model.dao.BookingDao;
import model.dao.ClassroomDao;
import model.dao.StudentDao;
import model.dao.TeacherDao;
import model.entity.Booking;
import model.entity.Classroom;
import model.entity.Person;
import model.entity.Teacher;

public class BookingController {
	
	private BookingDao bDao = new BookingDao();
	private TeacherDao tDao = new TeacherDao();
	private ClassroomDao cDao = new ClassroomDao();
	private StudentDao sDao = new StudentDao();
	
	private Booking newBooking = new Booking();
	private Collection<SelectItem> teachersSelectable = new ArrayList<SelectItem>();
	private Collection<SelectItem> classRoomsSelectable = new ArrayList<SelectItem>();
	private Collection<SelectItem> studentsSelectable = new ArrayList<SelectItem>();
	
	/**
	 * @return the bDao
	 */
	public BookingDao getbDao() {
		return bDao;
	}
	
	/**
	 * @return the tDao
	 */
	public TeacherDao gettDao() {
		return tDao;
	}
	
	/**
	 * @return the cDao
	 */
	public ClassroomDao getcDao() {
		return cDao;
	}
	
	/**
	 * @return the sDao
	 */
	public StudentDao getsDao() {
		return sDao;
	}
	
	/**
	 * @return the newBooking
	 */
	public Booking getNewBooking() {
		return newBooking;
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
		bDao.insert(newBooking);
		newBooking = new Booking();
		return "goToHome";
	}
	
	public String createBooking() {
		bDao.insert(newBooking);
		newBooking = new Booking();
		return "home";
	}

	/**
	 * @return the teachersSelectable
	 */
	public Collection<SelectItem> getTeachersSelectable() {
		teachersSelectable = new ArrayList<SelectItem>();
		for(Teacher t : gettDao().selectAll()){
			teachersSelectable.add(new SelectItem(t,t.getName()));
		}
		return teachersSelectable;
	}

	/**
	 * @return the classRoomsSelectable
	 */
	public Collection<SelectItem> getClassRoomsSelectable() {
		classRoomsSelectable = new ArrayList<SelectItem>();
		for(Classroom c : getcDao().selectAll()){
			String value = /*"Nature : " + getcDao().getClassroomNatureByName(c.getName())*/
					 "Nom : " + c.getName() 
					+ ", Building : " + c.getBuilding() 
					+ ", seatCapacity : " + c.getSeatCapacity();
			classRoomsSelectable.add(new SelectItem(c,value));
		}
		return classRoomsSelectable;
	}

	/**
	 * @return the studentsSelectable
	 */
	public Collection<SelectItem> getStudentsSelectable() {
		studentsSelectable = new ArrayList<SelectItem>();
		for(Person p : getsDao().selectAll()){
			studentsSelectable.add(new SelectItem(p,p.getName()));
		}
		return studentsSelectable;
	}

}
