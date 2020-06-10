package com.gateway.smartflow.statisticszone;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import com.gateway.smartflow.classification.Classification;
import com.gateway.smartflow.zone.Zone;

@Entity
@Table(name = "statistics_zone")
public class StatisticsZone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "count")
	private int count;
	
	@Column(name = "max_fill_level")
	private int maxFillLevel;
	
	@Column(name = "max_dwell")
	private double maxDwell;
	

	@Column(name = "mean_dwell")
	private double meanDwell;
	

	@Column(name = "timestamp")
	private LocalDate timestamp;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id", nullable = false)
    private Zone zone;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classification_id", nullable = false)
    private Classification classification;
	
	public StatisticsZone() {
		
	}

	//Fazer um builder para estes parametros
	public StatisticsZone(int count, int maxFillLevel, double maxDwell, double meanDwell, LocalDate timestamp,
			Zone zone, Classification classification) {
		super();
		this.count = count;
		this.maxFillLevel = maxFillLevel;
		this.maxDwell = maxDwell;
		this.meanDwell = meanDwell;
		this.timestamp = timestamp;
		this.zone = zone;
		this.classification = classification;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMaxFillLevel() {
		return maxFillLevel;
	}

	public void setMaxFillLevel(int maxFillLevel) {
		this.maxFillLevel = maxFillLevel;
	}

	public double getMaxDwell() {
		return maxDwell;
	}

	public void setMaxDwell(double maxDwell) {
		this.maxDwell = maxDwell;
	}

	public double getMeanDwell() {
		return meanDwell;
	}

	public void setMeanDwell(double meanDwell) {
		this.meanDwell = meanDwell;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
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
		return "StatisticsZone [id=" + id + ", count=" + count + ", maxFillLevel=" + maxFillLevel + ", maxDwell="
				+ maxDwell + ", meanDwell=" + meanDwell + ", timestamp=" + timestamp + ", zone=" + zone
				+ ", classification=" + classification + "]";
	}
	
	
	
	
	
	
	

}
