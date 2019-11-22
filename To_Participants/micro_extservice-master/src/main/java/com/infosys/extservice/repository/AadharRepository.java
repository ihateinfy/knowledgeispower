package com.infosys.extservice.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.extservice.entity.AadharMaster;

/**
 * The Interface AadharRepository.
 */
public interface AadharRepository extends JpaRepository<AadharMaster, String>{

	AadharMaster getByPhoneNo(String phoneNo);
}