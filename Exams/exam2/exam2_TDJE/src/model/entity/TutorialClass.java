package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TUTORIALCLASS")
public class TutorialClass extends Classroom implements Serializable {

	private static final long serialVersionUID = 8673022252547843319L;

	@Column(name = "VIDEOPROJECTOR")
	private boolean videoProjector;
	
	public TutorialClass() {}

	/**
	 * @return the videoProjector
	 */
	public boolean isVideoProjector() {
		return videoProjector;
	}

	/**
	 * @param videoProjector the videoProjector to set
	 */
	public void setVideoProjector(boolean videoProjector) {
		this.videoProjector = videoProjector;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (videoProjector ? 1231 : 1237);
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
		if (!(obj instanceof TutorialClass)) {
			return false;
		}
		TutorialClass other = (TutorialClass) obj;
		if (videoProjector != other.videoProjector) {
			return false;
		}
		return true;
	}
	
}
