package com.insurance.auto.model.vehicledetails.Response;

import java.util.List;
import java.util.Objects;

public class Responseext {
	private Object year;
	private Object make;
	private Object model;
	public Object getYear() {
		return year;
	}
	public void setYear(Object year) {
		this.year = year;
	}
	public Object getMake() {
		return make;
	}
	public void setMake(Object make) {
		this.make = make;
	}
	public Object getModel() {
		return model;
	}
	public void setModel(Object model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Responseext [year=" + year + ", make=" + make + ", model=" + model + "]";
	}
	
	
	/*
	 * public Responseext(List<Year> year, List<Make> make, List<Model> model) {
	 * 
	 * this.year = year; this.make = make; this.model = model; }
	 */
	
}
