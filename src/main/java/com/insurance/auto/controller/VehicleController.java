package com.insurance.auto.controller;

import com.insurance.auto.repository.UserRepository;
import com.insurance.auto.repository.VehicleRepository;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.insurance.auto.model.vehicledetails.MakeResults;
import com.insurance.auto.model.vehicledetails.Makeext;
import com.insurance.auto.model.vehicledetails.Modelext;
import com.insurance.auto.model.vehicledetails.VehicleDetails;
import com.insurance.auto.model.vehicledetails.Response.Make;
import com.insurance.auto.model.vehicledetails.Response.Model;
import com.insurance.auto.model.vehicledetails.Response.Responseext;
import com.insurance.auto.model.vehicledetails.Response.Year;
import com.insurance.auto.model.personaldetails.Places;
import com.insurance.auto.model.personaldetails.User;
import com.insurance.auto.model.personaldetails.Zipext;

import java.util.*;

@RestController
@RequestMapping("/api/vehicledetails")
public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@CrossOrigin
	@PostMapping("/vehicle")
	public VehicleDetails createVehicle(@Valid @RequestBody VehicleDetails vehicleDetails ) {
	
		VehicleDetails vehicleDetails1 = vehicleRepository.save(vehicleDetails);
		return vehicleDetails;
		
	}
	
	@CrossOrigin
	@GetMapping("/vehicles")
	public Page<VehicleDetails> listUsers(Pageable pageable)
	{
		return vehicleRepository.findAll(pageable);
	}
	
	@CrossOrigin
	@GetMapping(value="/vehicleMake/{Year}")
	public Responseext getvehicleModel(@PathVariable("Year") int year){
		RestTemplate resttemplate1 = new RestTemplate();
		ArrayList<Object> yearmake=new ArrayList<Object>();
		ArrayList<Object> mfrmake=new ArrayList<Object>();
		Responseext resp = new Responseext();  
		Makeext makeext = resttemplate1.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/"
				+ "GetMakesForManufacturerAndYear/hon?year=" + year +"&format=json", Makeext.class);
		String makeext2[] = new String[]{"count" + makeext.getCount()};
		System.out.print(makeext.getResults().getClass().getName());
		
		  for( MakeResults results:makeext.getResults()) {
			    Year yr = new Year();
				Make mfr = new Make();
				Model mdl = new Model();
			  yr.setYearid(results.getMake_ID());
			  yr.setMakename(results.getMake_Name());
			  mfr.setMfrid(results.getMake_ID());
			  mfr.setMfrname(results.getMake_Name());
			  mfr.setMakeid(results.getModel_ID());
			  mdl.setMakeid(results.getModel_ID());
			  mdl.setMakename(results.getMake_Name());
			  mdl.setMfrid(results.getMake_ID());
			  mdl.setMfrname(results.getMake_Name());
			  yearmake.add(yr);
			  mfrmake.add(mfr);
		 } 
		   resp.setYear(yearmake);
		   resp.setMake(mfrmake);
		return resp;
	}	
	
	@CrossOrigin
	@GetMapping(value="/vehicleModel/{Make}/{Year}")
	public Object getvehicleModel(@PathVariable("Make") String make, @PathVariable("Year") String year){
		RestTemplate resttemplate2 = new RestTemplate();
		Modelext modelext1 = resttemplate2.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/getmodelsformakeyear/make/" 
		+ make + "/modelyear/" + year +"?format=json", Modelext.class);  
		return modelext1.getResults();
	}
}
