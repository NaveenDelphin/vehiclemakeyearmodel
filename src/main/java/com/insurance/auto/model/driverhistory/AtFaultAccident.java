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
@Table(name="accidents") 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class AtFaultAccident {
	@Id
	@Column(name="accId",nullable=false)
	@SequenceGenerator(name="acc_Seq",sequenceName="accId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="acc_seq")
	private long accId;
	
	@Column(name="accidentdate")
	private String accidentDate;
	
	@Column(name="accidentdiscription")
	private String accidentDiscription;
	
	@Column(name="accidentammount")
	private String accidentAmmount;

	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}

	public String getAccidentDate() {
		return accidentDate;
	}

	public void setAccidentDate(String accidentDate) {
		this.accidentDate = accidentDate;
	}

	public String getAccidentDiscription() {
		return accidentDiscription;
	}

	public void setAccidentDiscription(String accidentDiscription) {
		this.accidentDiscription = accidentDiscription;
	}

	public String getAccidentAmmount() {
		return accidentAmmount;
	}

	public void setAccidentAmmount(String accidentAmmount) {
		this.accidentAmmount = accidentAmmount;
	}

	@Override
	public String toString() {
		return "AtFaultAccident [accId=" + accId + ", accidentDate=" + accidentDate + ", accidentDiscription="
				+ accidentDiscription + ", accidentAmmount=" + accidentAmmount + "]";
	}
}
