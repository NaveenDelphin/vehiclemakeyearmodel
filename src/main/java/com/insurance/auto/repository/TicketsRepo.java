package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.auto.model.driverhistory.Tickets;

public interface TicketsRepo  extends JpaRepository<Tickets, Long>{

}
