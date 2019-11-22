package com.infosys.extservice.entity;
 
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "aadhar_master")
public class AadharMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=12,name="aadharId")
	private String aadharId;

	@Column(length=25,nullable=false,name="firstName")
	private String firstName;
	
	@Column(length=25,nullable=false,name="lastName")
	private String lastName;

	@Column(length=10,name="phoneNo")
	private String phoneNo;
	
	@Column(length=50,nullable=false,name="address")
	private String address;
	
	/**
	 * Gets the aadhar id.
	 *
	 * @return the aadhar id
	 */
	public String getAadharId() {
		return this.aadharId;
	}

	@Override
	public String toString() {
		return "AadharMaster [aadharId=" + aadharId + ", firstName="
				+ firstName + ", lastName=" + lastName
				+ ", phoneNo=" + phoneNo + ", address=" + address + "]";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharId == null) ? 0 : aadharId.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AadharMaster other = (AadharMaster) obj;
		if (aadharId == null) {
			if (other.aadharId != null)
				return false;
		} else if (!aadharId.equals(other.aadharId))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}


}
