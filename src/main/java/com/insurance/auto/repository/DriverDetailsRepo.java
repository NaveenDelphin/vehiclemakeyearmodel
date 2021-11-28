package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.auto.model.driverdetails.Driver;

public interface DriverDetailsRepo extends JpaRepository<Driver, Long>{

}
