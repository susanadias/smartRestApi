package com.gateway.smartflow.trackinglines;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.*;
import com.gateway.smartflow.classification.Classification;
import com.gateway.smartflow.zone.Zone;

@Entity
@Table(name = "tracking_lines")
public class TrackingLine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "exit_time")
	private LocalDate exitTime;
	
	@Column(name = "person_id")
	private int personId;
	
	@Column(name = "entry_x")
	private int entryX;
	
	@Column(name = "entry_y")
	private int entryY;
	
	@Column(name = "exit_x")
	private int exitX;
	
	@Column(name = "exit_y")
	private int exitY;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id", nullable = false)
    private Zone zone;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classification_id", nullable = false)
    private Classification classification;
	
	public TrackingLine() {
	
	}
	
	

	public TrackingLine(LocalDate exitTime, int personId, int entryX, int entryY, int exitX, int exitY) {
		super();
		this.exitTime = exitTime;
		this.personId = personId;
		this.entryX = entryX;
		this.entryY = entryY;
		this.exitX = exitX;
		this.exitY = exitY;
	}



	public LocalDate getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDate exitTime) {
		this.exitTime = exitTime;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getEntryX() {
		return entryX;
	}

	public void setEntryX(int entryX) {
		this.entryX = entryX;
	}

	public int getEntryY() {
		return entryY;
	}

	public void setEntryY(int entryY) {
		this.entryY = entryY;
	}

	public int getExitX() {
		return exitX;
	}

	public void setExitX(int exitX) {
		this.exitX = exitX;
	}

	public int getExitY() {
		return exitY;
	}

	public void setExitY(int exitY) {
		this.exitY = exitY;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "TrackingLine [id=" + id + ", exitTime=" + exitTime + ", personId=" + personId + ", entryX=" + entryX
				+ ", entryY=" + entryY + ", exitX=" + exitX + ", exitY=" + exitY + ", zone=" + zone
				+ ", classification=" + classification + "]";
	}
	
	

}
