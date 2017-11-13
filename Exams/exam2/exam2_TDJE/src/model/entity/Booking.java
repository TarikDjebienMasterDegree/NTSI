package model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Booking implements Serializable {
	
	private static final long serialVersionUID = 7063662423070115240L;
	
	@Id
	@Column(name = "ID_BOOKING", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "STARTDATE")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDATE")
	private Date endDate;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "CLASSROOM_ID")
	private Classroom classroom;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "TEACHER_ID")
	private Teacher teacher;
	
	@ManyToMany
	private List<Person> students;
	
	@Transient
	//@Formula("(select count(p) from Person p)")
	private int nbOfStudents;

	public Booking(){}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the classroom
	 */
	public Classroom getClassroom() {
		return classroom;
	}

	/**
	 * @param classroom the classroom to set
	 */
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	/**
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the students
	 */
	public List<Person> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Person> students) {
		this.students = students;
	}

	/**
	 * @return the nbOfStudents
	 */
	public int getNbOfStudents() {
		return nbOfStudents;
	}

	/**
	 * @param nbOfStudents the nbOfStudents to set
	 */
	public void setNbOfStudents(int nbOfStudents) {
		this.nbOfStudents = nbOfStudents;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((classroom == null) ? 0 : classroom.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + nbOfStudents;
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result
				+ ((students == null) ? 0 : students.hashCode());
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Booking)) {
			return false;
		}
		Booking other = (Booking) obj;
		if (classroom == null) {
			if (other.classroom != null) {
				return false;
			}
		} else if (!classroom.equals(other.classroom)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nbOfStudents != other.nbOfStudents) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (students == null) {
			if (other.students != null) {
				return false;
			}
		} else if (!students.equals(other.students)) {
			return false;
		}
		if (teacher == null) {
			if (other.teacher != null) {
				return false;
			}
		} else if (!teacher.equals(other.teacher)) {
			return false;
		}
		return true;
	}
	
	
}
