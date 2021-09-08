package com.infosys.extservice.utilities;
 
import java.io.Serializable;

/**
 * The Class ClientErrorInfo.
 */
public class ClientErrorInfo implements Serializable{
	
	String code;

	String message;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 * @param error error information
	 */
	public ClientErrorInfo() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param error error information
	 */
	public ClientErrorInfo(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	

	/**
	 * Sets the error code.
	 *
	 * @param value
	 *            the new error code
	 */
	public void setCode(String value) {
		code = value;

	}

	/**
	 * Sets the message.
	 *
	 * @param msg
	 *            the new message
	 */
	public void setMessage(String msg) {
		message = msg;

	}

	/**
	 * Gets the error msg.
	 *
	 * @return the error msg
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public String getCode() {
		return code;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientErrorInfo [code=" + code + ", message=" + message + "]";
	}

}
