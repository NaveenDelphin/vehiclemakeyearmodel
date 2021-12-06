package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.auto.model.driverhistory.MajorViolation;

public interface MajorViolationRepo extends JpaRepository<MajorViolation, Long>{

}
