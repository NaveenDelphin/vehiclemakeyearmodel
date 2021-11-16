package com.insurance.auto.model.vehicledetails;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Modelext {
	private String Count;
	private String Message;
	private String SearchCriteria;
	private List<Modelresults> Results;
	@JsonProperty("Count")
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
		Count = count;
	}
	@JsonProperty("Message")
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@JsonProperty("SearchCriteria")
	public String getSearchCriteria() {
		return SearchCriteria;
	}
	public void setSearchCriteria(String searchCriteria) {
		SearchCriteria = searchCriteria;
	}
	@JsonProperty("Results")
	public List<Modelresults> getResults() {
		return Results;
	}
	public void setResults(List<Modelresults> results) {
		Results = results;
	}
	@Override
	public String toString() {
		return "Modelext [Count=" + Count + ", Message=" + Message + ", SearchCriteria=" + SearchCriteria + ", Results="
				+ Results + "]";
	}
	

}
