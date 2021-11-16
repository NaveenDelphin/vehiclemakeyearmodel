package com.insurance.auto.model.vehicledetails;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Modelresults {
	private int Make_ID;
	private String Make_Name;
	private int Model_ID;
	private String Model_Name;
	@JsonProperty("Make_ID")
	public int getMake_ID() {
		return Make_ID;
	}
	public void setMake_ID(int make_ID) {
		Make_ID = make_ID;
	}
	@JsonProperty("Make_Name")
	public String getMake_Name() {
		return Make_Name;
	}
	public void setMake_Name(String make_Name) {
		Make_Name = make_Name;
	}
	@JsonProperty("Model_ID")
	public int getModel_ID() {
		return Model_ID;
	}
	public void setModel_ID(int model_ID) {
		Model_ID = model_ID;
	}
	@JsonProperty("Model_Name")
	public String getModel_Name() {
		return Model_Name;
	}
	public void setModel_Name(String model_Name) {
		Model_Name = model_Name;
	}
	@Override
	public String toString() {
		return "Modelresults [Make_ID=" + Make_ID + ", Make_Name=" + Make_Name + ", Model_ID=" + Model_ID
				+ ", Model_Name=" + Model_Name + "]";
	}
	
	

}
