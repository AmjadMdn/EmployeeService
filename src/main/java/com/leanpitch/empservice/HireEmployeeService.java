package com.leanpitch.empservice;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;

public class HireEmployeeService {

	public boolean hireValidEmployee(Employee employee) {
		 if(employee.getFirstName() == null || employee.getLastName() == null) {
			 return false;
		 }
        int age = getAge(employee);
        if(age>=60){
        	return false;
        }
        if(employee.getLatestQualification().equals(QUALIFICATION.UG)){
        	return false;
        }
	return true;
	}

	private int getAge(Employee employee) {
		LocalDate dobTime = employee.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate now = LocalDate.now();
        int age = dobTime.getYear() - now.getYear();
		return age;
	}
	


}
