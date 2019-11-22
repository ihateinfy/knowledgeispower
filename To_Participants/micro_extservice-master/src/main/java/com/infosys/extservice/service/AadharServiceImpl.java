package com.infosys.extservice.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.extservice.dto.AadharDTO;
import com.infosys.extservice.entity.AadharMaster;
import com.infosys.extservice.exception.ExceptionConstants;
import com.infosys.extservice.exception.ExternalServiceException;
import com.infosys.extservice.repository.AadharRepository;


@SuppressWarnings("unused")
public class AadharServiceImpl implements AadharService {

	
	public boolean isAadharValid(String aadharId, String firstName, String lastName) throws ExternalServiceException {
 		Optional<AadharMaster> aadhar = null;
 		
	return false;
	}

	public AadharDTO getAadharDetails(String phoneNo) {
		
		return null;
	}

	public AadharDTO updateAddress(String aadharId, AadharDTO address) throws ExternalServiceException {
		Optional<AadharMaster> aadhar = null;
		
		return null;
	}
}
