package com.insurance.auto.controller;

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

import com.insurance.auto.model.driverdetails.Driver;

import com.insurance.auto.repository.DriverDetailsRepo;


import java.util.*;

@RestController
@RequestMapping("/api/driverdetails")
public class DriverController {
	
	@Autowired
	private DriverDetailsRepo driverDetailsRepo;
	
	@CrossOrigin
	@PostMapping("/driver")
	public ArrayList<Driver> createVehicle(@Valid @RequestBody ArrayList<Driver> driver) {
		for( Driver driverDetails: driver) {
		  Driver driverDetails1 = driverDetailsRepo.save(driverDetails);
		  System.out.print(driverDetails);
		}
		return driver;
	}
	
	@CrossOrigin
	@GetMapping("/drivers")
	public Page<Driver> listUsers(Pageable pageable)
	{
		return driverDetailsRepo.findAll(pageable);
	}
}
