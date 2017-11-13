package model.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment implements Serializable {
	
	private static final long serialVersionUID = -1870663011622536254L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private float price;
	
	@ManyToMany
	private Collection<SparePart> spareParts;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private Mechanic mechanic;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the spareParts
	 */
	public Collection<SparePart> getSpareParts() {
		return spareParts;
	}

	/**
	 * @param spareParts the spareParts to set
	 */
	public void setSpareParts(Collection<SparePart> spareParts) {
		this.spareParts = spareParts;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the mechanic
	 */
	public Mechanic getMechanic() {
		return mechanic;
	}

	/**
	 * @param mechanic the mechanic to set
	 */
	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((mechanic == null) ? 0 : mechanic.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result
				+ ((spareParts == null) ? 0 : spareParts.hashCode());
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
		if (!(obj instanceof Appointment)) {
			return false;
		}
		Appointment other = (Appointment) obj;
		if (customer == null) {
			if (other.customer != null) {
				return false;
			}
		} else if (!customer.equals(other.customer)) {
			return false;
		}
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (mechanic == null) {
			if (other.mechanic != null) {
				return false;
			}
		} else if (!mechanic.equals(other.mechanic)) {
			return false;
		}
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price)) {
			return false;
		}
		if (spareParts == null) {
			if (other.spareParts != null) {
				return false;
			}
		} else if (!spareParts.equals(other.spareParts)) {
			return false;
		}
		return true;
	}
	
}
