package com.infosys.extservice.exception;
 
/**
 * The Enum ExceptionConstants.
 */
public enum ExceptionConstants {

	/** The customer firstname invalid. */
	CUSTOMER_FIRSTNAME_INVALID(	"customer.firstname.invalid"), 
	
	/** The customer lastname invalid. */
	CUSTOMER_LASTNAME_INVALID("customer.lastname.invalid"), 
	
	/** The customer phoneNo invalid. */
	CUSTOMER_PHONE_INVALID("customer.phone.invalid"),
	
	CUSTOMER_ADDRESS_INVALID("customer.address.invalid"),
	
	/** The customer phoneNo invalid. */
	CUSTOMER_PHONE_LENGTH_INVALID("customer.phone.length.invalid"),
	
	/** The customer aadhar format invalid. */
	CUSTOMER_AADHAR_FORMAT_INVALID("customer.aadhar.format.invalid"), 
	
	/** The customer aadhar invalid. */
	CUSTOMER_AADHAR_INVALID("customer.aadhar.invalid"), 
	
	/** The validation failed */
	VALIDATION_FAILED("validation.failed"),
	
	/** The validation failed */
	INPUT_PARM_MISSING("input.parameter.missing"),
	
	/** The server failed */
	SERVER_ERROR("server.error"),
	
	/** The customer ifsc code not found. */
	CUSTOMER_IFSC_CODE_NOT_FOUND("customer.ifsc.code.not.found");

	/** The type. */
	private final String type;

	/**
	 * Instantiates a new exception constants.
	 *
	 * @param type the type
	 */
	private ExceptionConstants(String type) {
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return this.type;
	}
}
