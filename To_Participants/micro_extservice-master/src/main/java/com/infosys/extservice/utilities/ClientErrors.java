package com.infosys.extservice.utilities;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class ClientErrors.
 */
public class ClientErrors implements Serializable {

	/**
	 * Errors
	 */
	List<ClientErrorInfo> errors;

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 */
	public ClientErrors() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param error
	 *            error information
	 */
	public ClientErrors(String errorCode, String errorMessage) {
		super();
		errors = new ArrayList<ClientErrorInfo>();
		errors.add(new ClientErrorInfo(errorCode, errorMessage));
	}

	/**
	 * Gets errors.
	 *
	 * @return errors
	 */
	public List<ClientErrorInfo> getErrors() {
		return errors;
	}

	/**
	 * Sets the errors.
	 *
	 * @param errors
	 *            the errors
	 */
	public void setErrors(List<ClientErrorInfo> errors) {
		this.errors = errors;
	}

	/**
	 * Sets the errors.
	 *
	 * @param errors
	 *            the errors
	 */
	public void addError(String errorCode, String errorMessage) {
		if (errors == null) {
			errors = new ArrayList<ClientErrorInfo>();
		}
		errors.add(new ClientErrorInfo(errorCode, errorMessage));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientErrors [errors=" + errors + "]";
	}

}
