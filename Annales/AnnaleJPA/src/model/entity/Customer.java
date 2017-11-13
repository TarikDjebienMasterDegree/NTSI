package model.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Customer extends Person implements Serializable {
	
	private static final long serialVersionUID = 5239922870323487145L;
	
	private String carRegistration;
	
	@OneToMany(mappedBy = "customer")
	private Collection<Appointment> appointments;

	/**
	 * @return the carRegistration
	 */
	public String getCarRegistration() {
		return carRegistration;
	}

	/**
	 * @param carRegistration the carRegistration to set
	 */
	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	/**
	 * @return the appointments
	 */
	public Collection<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(Collection<Appointment> appointments) {
		this.appointments = appointments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((appointments == null) ? 0 : appointments.hashCode());
		result = prime * result
				+ ((carRegistration == null) ? 0 : carRegistration.hashCode());
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
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (appointments == null) {
			if (other.appointments != null) {
				return false;
			}
		} else if (!appointments.equals(other.appointments)) {
			return false;
		}
		if (carRegistration == null) {
			if (other.carRegistration != null) {
				return false;
			}
		} else if (!carRegistration.equals(other.carRegistration)) {
			return false;
		}
		return true;
	}

}
