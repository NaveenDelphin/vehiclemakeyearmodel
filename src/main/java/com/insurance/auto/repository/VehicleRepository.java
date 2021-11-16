package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.auto.model.vehicledetails.VehicleDetails;

public interface VehicleRepository extends JpaRepository<VehicleDetails, Long>{

}
