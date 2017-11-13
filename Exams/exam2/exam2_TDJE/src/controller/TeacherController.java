package controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import model.dao.TeacherDao;
import model.entity.Teacher;


public class TeacherController {
	
	private TeacherDao tDao = new TeacherDao();
	private DataModel teachers;
	private Teacher newTeacher = new Teacher();
	private Teacher editTeacher;
	
	/**
	 * @return the tDao
	 */
	public TeacherDao gettDao() {
		return tDao;
	}
	/**
	 * @return the teachers
	 */
	public DataModel getTeachers() {
		if(teachers == null){
			teachers = new ListDataModel();
			teachers.setWrappedData(tDao.selectAll());
		}
		return teachers;
	}
	/**
	 * @return the newTeacher
	 */
	public Teacher getNewTeacher() {
		return newTeacher;
	}
	/**
	 * @return the editTeacher
	 */
	public Teacher getEditTeacher() {
		return editTeacher;
	}
	
	public String createTeacher() {
		tDao.insert(newTeacher);
		newTeacher = new Teacher();
		teachers.setWrappedData(tDao.selectAll());
		return "listTeachers";
	}
	
	public String deleteTeacher() {
		Teacher t = (Teacher) teachers.getRowData();
		tDao.delete(t);
		teachers.setWrappedData(tDao.selectAll());
		return null;
	}
	
	public String editerTeacher() {
		editTeacher = (Teacher) teachers.getRowData();
		return "editTeacher";
	}
	
	public String updateTeacher() {
		tDao.update(editTeacher);
		teachers.setWrappedData(tDao.selectAll());
		return "updateTeacher";
	}

}
