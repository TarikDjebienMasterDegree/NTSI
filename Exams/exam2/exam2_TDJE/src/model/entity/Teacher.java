package model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class Teacher extends Person implements Serializable {

	private static final long serialVersionUID = 6418339225109965961L;

	@Column(name = "SUBJECT")
	private String subject;
	
	@OneToMany(mappedBy = "teacher")
	private List<Booking> teacherBookings;
	
	public Teacher() {}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the teacherBookings
	 */
	public List<Booking> getTeacherBookings() {
		return teacherBookings;
	}

	/**
	 * @param teacherBookings the teacherBookings to set
	 */
	public void setTeacherBookings(List<Booking> teacherBookings) {
		this.teacherBookings = teacherBookings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result
				+ ((teacherBookings == null) ? 0 : teacherBookings.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Teacher)) {
			return false;
		}
		Teacher other = (Teacher) obj;
		if (subject == null) {
			if (other.subject != null) {
				return false;
			}
		} else if (!subject.equals(other.subject)) {
			return false;
		}
		if (teacherBookings == null) {
			if (other.teacherBookings != null) {
				return false;
			}
		} else if (!teacherBookings.equals(other.teacherBookings)) {
			return false;
		}
		return true;
	}
	
}
