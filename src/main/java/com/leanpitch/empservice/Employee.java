package com.leanpitch.empservice;

import java.util.Date;

public class Employee{
	 
	private String  firstName;
	private String lastName;
	private Date dob;
	private QUALIFICATION latestQualification;
	
	public Employee(String firstName, String lastName, Date dob,
			QUALIFICATION latestQualification) {
		super();
		this.firstName =  firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.latestQualification = latestQualification;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public QUALIFICATION getLatestQualification() {
		 return latestQualification;
	}
	public void setLatestQualification(QUALIFICATION latestQualification) {
		this.latestQualification = latestQualification;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime
				* result
				+ ((latestQualification == null) ? 0 : latestQualification
						.hashCode());
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
		Employee other = (Employee) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
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
		if (latestQualification == null) {
			if (other.latestQualification != null)
				return false;
		} else if (!latestQualification.equals(other.latestQualification))
			return false;
		return true;
	}
	
	

}
