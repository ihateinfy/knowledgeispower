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

/**
 * The Class AadharServiceImpl.
 */
@Service
public class AadharServiceImpl implements AadharService {
@Autowired
AadharServiceValidation serviceVal;
	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/** The aadhar repository. */
	@Autowired
	AadharRepository aadharRepository;

	/**
	 * Perform KYC authentication.
	 *
	 * @param aadharId
	 *            the aadhar id
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 * @return true, if successful
	 * @throws ExternalServiceException
	 *             the external service exception
	 */
	// Given
//	public boolean isInputValid(String aadharId, String firstName, String lastName) throws ExternalServiceException {
//		if (!(aadharId.matches("[0-9]{12}")))
//			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_AADHAR_FORMAT_INVALID.toString());
//		else if (firstName.length() == 0)
//			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_FIRSTNAME_INVALID.toString());
//		else if (lastName.length() == 0)
//			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_LASTNAME_INVALID.toString());
//		else
//			return true;
//	}
//	
//	// Given
//	public boolean isPhoneNoValid(String phoneNo) throws ExternalServiceException {
//		if (!(phoneNo.matches("[0-9]{10}")))
//			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_PHONE_LENGTH_INVALID.toString());
////		else if (phoneNo.length() == 0)
////			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_PHONE_LENGTH_INVALID.toString());
//		else
//			return true;
//	}

	/**
	 * Checks if is aadhar valid.
	 *
	 * @param aadharId
	 *            the aadhar id
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 * @return true, if is aadhar valid
	 * @throws ExternalServiceException
	 *             the external service exception
	 */
	public boolean isAadharValid(String aadharId, String firstName, String lastName) throws ExternalServiceException {
		//Given  **************************//
 		Optional<AadharMaster> aadhar = null;
	
 		boolean valid = false;

		// If input is valid then fetch the aadhar record from the database
		if (serviceVal.isInputValid(aadharId, firstName, lastName)) {
			logger.debug("Input Validation Passed");
			aadhar = aadharRepository.findById(aadharId);
			logger.debug("Aadhar details from database: {}", aadhar);
		}
		// Aadhar is valid when Aadhar Id, First Name and Last Name match
		if ((aadhar != null) && (aadhar.get().getFirstName().equalsIgnoreCase(firstName))
				&& (aadhar.get().getLastName().equalsIgnoreCase(lastName))) {
			logger.debug("Aadhar is valid");
			valid = true;
		}
		return valid;
	}

	public AadharDTO getAadharDetails(String phoneNo) {
		AadharMaster aadhar = null;

		// If input is valid then fetch the aadhar record from the database
		if (serviceVal.isPhoneNoValid(phoneNo)) {
			logger.debug("Input Validation Passed");
			aadhar = aadharRepository.getByPhoneNo(phoneNo);
			if (aadhar != null)
				logger.debug("Aadhar is valid");
			else
				throw new ExternalServiceException(ExceptionConstants.CUSTOMER_PHONE_INVALID.toString());
		} else {
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_PHONE_LENGTH_INVALID.toString());
		}
		return AadharDTO.prepareDTO(aadhar);
	}

	public AadharDTO updateAddress(String aadharId, AadharDTO address) throws ExternalServiceException {
		AadharMaster aadhar1 = null;
		// Given
		Optional<AadharMaster> aadhar = null;
		
		if (!(aadharId.matches("[0-9]{12}")))
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_AADHAR_FORMAT_INVALID.toString());

		else if (!serviceVal.isAddressValid(address.getAddress()))
			throw new ExternalServiceException(ExceptionConstants.CUSTOMER_ADDRESS_INVALID.toString());

		else 
		{
			logger.debug("Input Validation Passed");
			aadhar = aadharRepository.findById(aadharId);
			if (aadhar != null) {
				aadhar1 = aadhar.get();
				aadhar1.setAddress(address.getAddress());
				AadharMaster cust = aadharRepository.saveAndFlush(aadhar1);
				if (cust == null) {
					logger.error("Customer could not be updated");
					throw new ExternalServiceException(ExceptionConstants.SERVER_ERROR.toString());
				}
				logger.debug("Aadhar details from database: {}", aadhar1);
			} else {
				throw new ExternalServiceException(ExceptionConstants.CUSTOMER_AADHAR_INVALID.toString());
			}
		}
		return AadharDTO.prepareDTO(aadhar1);
	}

}
