package com.insurance.auto.model.driverdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="driverdetails") 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Driver {
	@Id
	@Column(name="driverId",nullable=false)
	@SequenceGenerator(name="driver_Seq",sequenceName="driverId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="driver_seq")

	private long driverId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="lisenceNo")
	private String lisenceNo;
	
	@Column(name="lisenceissuedate")
	private String lisenceissuedate;
	
	@Column(name="lisencevalidity")
	private String lisencevalidity;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zipcode")
	private String zipcode;
	
	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}
	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonProperty("dob")
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	@JsonProperty("lisenceNo")
	public String getLisenceNo() {
		return lisenceNo;
	}

	public void setLisenceNo(String lisenceNo) {
		this.lisenceNo = lisenceNo;
	}
	@JsonProperty("lid")
	public String getLisenceissuedate() {
		return lisenceissuedate;
	}

	public void setLisenceissuedate(String lisenceissuedate) {
		this.lisenceissuedate = lisenceissuedate;
	}
	@JsonProperty("lisValidity")
	public String getLisencevalidity() {
		return lisencevalidity;
	}

	public void setLisencevalidity(String lisencevalidity) {
		this.lisencevalidity = lisencevalidity;
	}
	@JsonProperty("middleName")
	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	@JsonProperty("phoneNo")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@JsonProperty("streetAdd")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@JsonProperty("state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@JsonProperty("zipCode")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", firstName=" + firstName + ", middlename=" + middlename
				+ ", lastName=" + lastName + ", dob=" + dob + ", lisenceNo=" + lisenceNo + ", lisenceissuedate="
				+ lisenceissuedate + ", lisencevalidity=" + lisencevalidity + ", phone=" + phone + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
}
