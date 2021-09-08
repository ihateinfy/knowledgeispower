package com.infosys.extservice.service;

import com.infosys.extservice.dto.AadharDTO;
import com.infosys.extservice.exception.ExternalServiceException;

/**
 * The AadharService interface.
 */

public interface AadharService {

	public boolean isAadharValid(String aadharId, String firstName, String lastName) throws ExternalServiceException;

	public AadharDTO getAadharDetails(String phoneNo);

	public AadharDTO updateAddress(String aadharId, AadharDTO address) throws ExternalServiceException ;

}
