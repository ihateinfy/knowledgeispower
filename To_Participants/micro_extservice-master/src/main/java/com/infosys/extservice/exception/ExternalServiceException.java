/**
 * 
 */
package com.infosys.extservice.exception;
 
/**
 * The Class ExternalServiceException.
 *
 * @author Infosys
 */
public class ExternalServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new external service exception.
	 *
	 * @param message the message
	 */
	public ExternalServiceException(String message) {
		super(message);
	}

}