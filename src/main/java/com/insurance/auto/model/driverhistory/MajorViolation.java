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
@Table(name="violation") 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class MajorViolation {
	@Id
	@Column(name="violationId",nullable=false)
	@SequenceGenerator(name="violation_Seq",sequenceName="violationId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="violation_seq")
	private long violationId;
	
	@Column(name="violationdiscription")
	private String violationDiscription;
	
	@Column(name="violationdate")
	private String violationDate;

	public long getViolationId() {
		return violationId;
	}

	public void setViolationId(long violationId) {
		this.violationId = violationId;
	}

	public String getViolationDiscription() {
		return violationDiscription;
	}

	public void setViolationDiscription(String violationDiscription) {
		this.violationDiscription = violationDiscription;
	}

	public String getViolationDate() {
		return violationDate;
	}

	public void setViolationDate(String violationDate) {
		this.violationDate = violationDate;
	}

	@Override
	public String toString() {
		return "MajorViolation [violationId=" + violationId + ", violationDiscription=" + violationDiscription
				+ ", violationDate=" + violationDate + "]";
	}
}
