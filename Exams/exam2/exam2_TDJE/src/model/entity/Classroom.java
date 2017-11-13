package model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "typeclassroom", discriminatorType = DiscriminatorType.STRING)
public abstract class Classroom implements Serializable {
	
	private static final long serialVersionUID = 8955955686260512487L;
	
	@Id
	@Column(name = "ID_CLASSROOM", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	@Column(name = "SEATCAPACITY")
	protected int seatCapacity;
	
	@Column(name = "BUILDING")
	protected String building;
	
	@Column(name = "NAME")
	protected String name;
	
	@OneToMany(mappedBy = "classroom")
	protected List<Booking> bookings;
	
	protected Classroom() {}

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
	 * @return the seatCapacity
	 */
	public int getSeatCapacity() {
		return seatCapacity;
	}

	/**
	 * @param seatCapacity the seatCapacity to set
	 */
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bookings
	 */
	public List<Booking> getBookings() {
		return bookings;
	}

	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bookings == null) ? 0 : bookings.hashCode());
		result = prime * result
				+ ((building == null) ? 0 : building.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + seatCapacity;
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
		if (!(obj instanceof Classroom)) {
			return false;
		}
		Classroom other = (Classroom) obj;
		if (bookings == null) {
			if (other.bookings != null) {
				return false;
			}
		} else if (!bookings.equals(other.bookings)) {
			return false;
		}
		if (building == null) {
			if (other.building != null) {
				return false;
			}
		} else if (!building.equals(other.building)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (seatCapacity != other.seatCapacity) {
			return false;
		}
		return true;
	}
	
	
}
