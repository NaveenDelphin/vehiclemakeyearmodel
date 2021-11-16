package com.insurance.auto.model.vehicledetails;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MakeResults {
	private int Make_ID;
	private String Make_Name;
	private int Model_ID;
	private String Model_Name;
	@JsonProperty("MakeId")
	public int getMake_ID() {
		return Make_ID;
	}
	public void setMake_ID(int make_ID) {
		Make_ID = make_ID;
	}
	@JsonProperty("MakeName")
	public String getMake_Name() {
		return Make_Name;
	}
	public void setMake_Name(String make_Name) {
		Make_Name = make_Name;
	}
	@JsonProperty("MfrId")
	public int getModel_ID() {
		return Model_ID;
	}
	public void setModel_ID(int model_ID) {
		Model_ID = model_ID;
	}
	@JsonProperty("MfrName")
	public String getModel_Name() {
		return Model_Name;
	}
	public void setModel_Name(String model_Name) {
		Model_Name = model_Name;
	}
	@Override
	public String toString() {
		return "MakeResults [Make_ID=" + Make_ID + ", Make_Name=" + Make_Name + ", Model_ID=" + Model_ID
				+ ", Model_Name=" + Model_Name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Make_ID, Make_Name, Model_ID, Model_Name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MakeResults other = (MakeResults) obj;
		return Make_ID == other.Make_ID && Objects.equals(Make_Name, other.Make_Name) && Model_ID == other.Model_ID
				&& Objects.equals(Model_Name, other.Model_Name);
	}
	
}
