package com.insurance.auto.model.driverhistory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="tickets") 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Tickets {
	@Id
	@Column(name="ticketId",nullable=false)
	@SequenceGenerator(name="ticket_Seq",sequenceName="ticketId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="ticket_seq")
	private long ticketId;
	
	@Column(name="driver")
	private String driver;
	
	@Column(name="ticketdiscription")
	private String ticketDiscription;
	
	@Column(name="ticketdate")
	private String ticketDate;

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getTicketDiscription() {
		return ticketDiscription;
	}

	public void setTicketDiscription(String ticketDiscription) {
		this.ticketDiscription = ticketDiscription;
	}

	public String getTicketDate() {
		return ticketDate;
	}

	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}

	@Override
	public String toString() {
		return "Tickets [ticketId=" + ticketId + ", driver=" + driver + ", ticketDiscription=" + ticketDiscription
				+ ", ticketDate=" + ticketDate + "]";
	}
}
