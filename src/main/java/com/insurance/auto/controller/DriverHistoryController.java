package com.insurance.auto.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.auto.model.driverhistory.AtFaultAccident;
import com.insurance.auto.model.driverhistory.MajorViolation;
import com.insurance.auto.model.driverhistory.Tickets;
import com.insurance.auto.repository.AtFaultAccidentRepo;
import com.insurance.auto.repository.MajorViolationRepo;
import com.insurance.auto.repository.TicketsRepo;

@RestController
@RequestMapping("/api/driverhistory")
public class DriverHistoryController {
	
	@Autowired
	private AtFaultAccidentRepo atfaultaccidentrepo;
	
	@Autowired
	private MajorViolationRepo majorviolationrepo;
	
	@Autowired
	private TicketsRepo ticketsrepo;
	
	@CrossOrigin
	@PostMapping("/accident")
	public ArrayList<AtFaultAccident> createAccident(@Valid @RequestBody ArrayList<AtFaultAccident> ataccident) {
		for( AtFaultAccident accDetails: ataccident) {
			AtFaultAccident accDetails1 = atfaultaccidentrepo.save(accDetails);
		  System.out.print(accDetails);
		}
		return ataccident;
	}
	
	@CrossOrigin
	@GetMapping("/accidents")
	public Page<AtFaultAccident> listAcc(Pageable pageable)
	{
		return atfaultaccidentrepo.findAll(pageable);
	}
	
	@CrossOrigin
	@PostMapping("/violation")
	public ArrayList<MajorViolation> createViolation(@Valid @RequestBody ArrayList<MajorViolation> majvio) {
		for( MajorViolation vioDetails: majvio) {
			MajorViolation vioDetails1 = majorviolationrepo.save(vioDetails);
		  System.out.print(vioDetails);
		}
		return majvio;
	}
	
	@CrossOrigin
	@GetMapping("/violations")
	public Page<MajorViolation> listVio(Pageable pageable)
	{
		return majorviolationrepo.findAll(pageable);
	}
	
	@CrossOrigin
	@PostMapping("/ticket")
	public ArrayList<Tickets> createTicket(@Valid @RequestBody ArrayList<Tickets> ticket) {
		for( Tickets ticketDetails: ticket) {
			Tickets ticketDetails1 = ticketsrepo.save(ticketDetails);
		  System.out.print(ticketDetails);
		}
		return ticket;
	}
	
	@CrossOrigin
	@GetMapping("/tickets")
	public Page<Tickets> listTicket(Pageable pageable)
	{
		return ticketsrepo.findAll(pageable);
	}
}
