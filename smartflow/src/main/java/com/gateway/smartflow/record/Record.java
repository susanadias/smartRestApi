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
	

}
