package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PRACTICALCLASS")
public class PracticalClass extends Classroom implements Serializable {

	private static final long serialVersionUID = -5191165295536659022L;
	
	@Column(name = "COMPUTERTYPE")
	private String computerType;
	
	public PracticalClass() {}

	/**
	 * @return the computerType
	 */
	public String getComputerType() {
		return computerType;
	}

	/**
	 * @param computerType the computerType to set
	 */
	public void setComputerType(String computerType) {
		this.computerType = computerType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((computerType == null) ? 0 : computerType.hashCode());
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
		if (!(obj instanceof PracticalClass)) {
			return false;
		}
		PracticalClass other = (PracticalClass) obj;
		if (computerType == null) {
			if (other.computerType != null) {
				return false;
			}
		} else if (!computerType.equals(other.computerType)) {
			return false;
		}
		return true;
	}
	
}
