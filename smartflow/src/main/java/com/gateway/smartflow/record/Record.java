package com.gateway.smartflow.record;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.gateway.smartflow.channel.Channel;
import com.gateway.smartflow.classification.Classification;
import com.gateway.smartflow.device.Device;


@Entity
@Table(name = "Record")
public class Record implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "count_in")
	private int countIn;
	
	@Column(name = "count_out")
	private int countOut;
	
	@Column(name = "timestamp")
    private LocalDate timestamp;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classification_id", nullable = false)
    private Classification classification;
	
	
	public Record() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getCountIn() {
		return countIn;
	}


	public void setCountIn(int countIn) {
		this.countIn = countIn;
	}


	public int getCountOut() {
		return countOut;
	}


	public void setCountOut(int countOut) {
		this.countOut = countOut;
	}


	public LocalDate getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}


	public Channel getChannel() {
		return channel;
	}


	public void setChannel(Channel channel) {
		this.channel = channel;
	}


	public Classification getClassification() {
		return classification;
	}


	public void setClassification(Classification classification) {
		this.classification = classification;
	}


	@Override
	public String toString() {
		return "Record [id=" + id + ", countIn=" + countIn + ", countOut=" + countOut + ", timestamp=" + timestamp
				+ ", channel=" + channel + ", classification=" + classification + "]";
	}
	
	
	

}
