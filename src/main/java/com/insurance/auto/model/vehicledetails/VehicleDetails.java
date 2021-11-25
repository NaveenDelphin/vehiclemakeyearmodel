package com.insurance.auto.model.vehicledetails;

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
@Table(name="vehicledetails") 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class VehicleDetails {
	@Id
	@Column(name="vehicleId",nullable=false)
	@SequenceGenerator(name="vehicle_Seq",sequenceName="vehicleId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="vehicle_seq")
	private long vehicleId;
	
	@Column(name="engineNo")
	@JsonProperty("vinNo")
	private String engineNo;
	
	@Column(name="year")
	private String year;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="vehicleFinance")
	private String vehicleFinance;
	
	@JsonProperty("vinNo")
	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	@JsonProperty("year")
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	@JsonProperty("make")
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	@JsonProperty("model")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	@JsonProperty("vehicleFinance")
	public String getVehicleFinance() {
		return vehicleFinance;
	}

	public void setVehicleFinance(String vehicleFinance) {
		this.vehicleFinance = vehicleFinance;
	}

	@Override
	public String toString() {
		return "VehicleDetails [engineNo=" + engineNo + ", year=" + year + ", make=" + make + ", model=" + model
				+ ", vehicleFinance=" + vehicleFinance + "]";
	}
	
}
