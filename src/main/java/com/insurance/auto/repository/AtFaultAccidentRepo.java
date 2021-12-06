package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.auto.model.driverhistory.AtFaultAccident;

public interface AtFaultAccidentRepo extends JpaRepository<AtFaultAccident, Long>{

}
