package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LECTUREHALL")
public class LectureHall extends Classroom implements Serializable {

	private static final long serialVersionUID = -7897534016144645690L;
	
	@Column(name = "SOUNDSYSTEM")
	private boolean soundSystem;
	
	@Column(name = "VIDEOPROJECTOR")
	private boolean videoProjector;
	
	public LectureHall() {}

	/**
	 * @return the soundSystem
	 */
	public boolean isSoundSystem() {
		return soundSystem;
	}

	/**
	 * @param soundSystem the soundSystem to set
	 */
	public void setSoundSystem(boolean soundSystem) {
		this.soundSystem = soundSystem;
	}

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
		result = prime * result + (soundSystem ? 1231 : 1237);
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
		if (!(obj instanceof LectureHall)) {
			return false;
		}
		LectureHall other = (LectureHall) obj;
		if (soundSystem != other.soundSystem) {
			return false;
		}
		if (videoProjector != other.videoProjector) {
			return false;
		}
		return true;
	}
	
}
