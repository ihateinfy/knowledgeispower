package com.infosys.extservice.dto;
 
import java.io.Serializable;

import com.infosys.extservice.entity.AadharMaster;

/**
 * The Class AadharDTO.
 */
public class AadharDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String aadharId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String address;
	
	/**
	 * Gets the aadhar id.
	 *
	 * @return the aadhar id
	 */
	public String getAadharId() {
		return this.aadharId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Sets the aadhar id.
	 *
	 * @param aadharId
	 *            the new aadhar id
	 */
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	/** Aadhar Valid Flag */
	private boolean aadharValid;

	/**
	 * Gets the aadhar valid flag
	 *
	 * @return the aadhar valid flag
	 */
	public boolean isAadharValid() {
		return this.aadharValid;
	}

	/**
	 * Sets the aadhar valid flag
	 *
	 * @param aadharValid aadhar valid flag
	 */
	public void setAadharValid(boolean aadharValid) {
		this.aadharValid = aadharValid;
	}

	@Override
	public String toString() {
		return "AadharDTO [aadharId=" + aadharId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", address=" + address + ", aadharValid=" + aadharValid + "]";
	}
	public AadharMaster prepareEntity(AadharDTO dto) {
		AadharMaster entity=new AadharMaster();
		entity.setAadharId(dto.getAadharId());
		entity.setAddress(dto.getAddress());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setPhoneNo(dto.getPhoneNo());
		return entity;
	}
	
	public static AadharDTO prepareDTO(AadharMaster entity) {
		AadharDTO dto=new AadharDTO();
		dto.setAadharId(entity.getAadharId());
		dto.setAddress(entity.getAddress());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setPhoneNo(entity.getPhoneNo());
		return dto;
	}
}
