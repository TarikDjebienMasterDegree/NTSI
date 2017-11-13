package controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import model.dao.StudentDao;
import model.entity.Person;

public class StudentController {
	
	private StudentDao sDao = new StudentDao();
	private DataModel students;
	private Person newStudent = new Person();
	
	/**
	 * @return the sDao
	 */
	public StudentDao getsDao() {
		return sDao;
	}
	/**
	 * @return the students
	 */
	public DataModel getStudents() {
		if(students == null){
			students = new ListDataModel();
			students.setWrappedData(sDao.selectAll());
		}
		return students;
	}
	
	/**
	 * @return the newStudent
	 */
	public Person getNewStudent() {
		return newStudent;
	}
	
	public String createStudent() {
		sDao.insert(newStudent);
		newStudent = new Person();
		students.setWrappedData(sDao.selectAll());
		return "listStudents";
	}
	
}
