package com.infosys.extservice.service;

import org.springframework.stereotype.Service;

import com.infosys.extservice.exception.ExceptionConstants;
import com.infosys.extservice.exception.ExternalServiceException;
@Service
public class AadharServiceValidation {
	public boolean isInputValid(String aadharId, String firstName, String lastName) throws ExternalServiceException {
		if (!(aadharId.matches("[0-9]{12}")))
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_AADHAR_FORMAT_INVALID.toString());
		else if (firstName.length() == 0)
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_FIRSTNAME_INVALID.toString());
		else if (lastName.length() == 0)
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_LASTNAME_INVALID.toString());
		else
			return true;
	}
	
	// Given
	public boolean isPhoneNoValid(String phoneNo) throws ExternalServiceException {
		if (!(phoneNo.matches("[0-9]{10}")))
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_PHONE_LENGTH_INVALID.toString());
		return true;
	}
	public boolean isAddressValid(String address) throws ExternalServiceException {
		if (address.length()==0)
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_ADDRESS_INVALID.toString());
		return true;
	}

}
