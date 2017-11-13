package model.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Mechanic extends Person implements Serializable{
	
	private static final long serialVersionUID = 3757234216522655722L;
	
	private String garageName;
	private String address;
	private int postalCode;
	private String city;
	
	@OneToMany(mappedBy = "mechanic")
	private Collection< Appointment> appointments;

	/**
	 * @return the garageName
	 */
	public String getGarageName() {
		return garageName;
	}

	/**
	 * @param garageName the garageName to set
	 */
	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((appointments == null) ? 0 : appointments.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((garageName == null) ? 0 : garageName.hashCode());
		result = prime * result + postalCode;
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
		if (!(obj instanceof Mechanic)) {
			return false;
		}
		Mechanic other = (Mechanic) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (appointments == null) {
			if (other.appointments != null) {
				return false;
			}
		} else if (!appointments.equals(other.appointments)) {
			return false;
		}
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (garageName == null) {
			if (other.garageName != null) {
				return false;
			}
		} else if (!garageName.equals(other.garageName)) {
			return false;
		}
		if (postalCode != other.postalCode) {
			return false;
		}
		return true;
	}

}
