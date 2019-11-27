package com.infosys.extservice.service;

import java.util.Optional;
import com.infosys.extservice.dto.AadharDTO;
import com.infosys.extservice.entity.AadharMaster;
import com.infosys.extservice.exception.ExternalServiceException;


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
