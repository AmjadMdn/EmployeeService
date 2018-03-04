package com.leanpitch.empservice;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HireEmployeeServiceTest extends TestCase {
	

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testHireValidEmployee(){
		//Arrange
		HireEmployeeService hireEmpService = new HireEmployeeService();
		Date dob = new GregorianCalendar(1980, Calendar.JANUARY, 1).getTime();
		Employee employee = new Employee("Deven","Parek",dob,QUALIFICATION.G);
		//Act
		boolean isEmpHired = hireEmpService.hireValidEmployee(employee);
		//Assert
		Assert.assertEquals(true, isEmpHired);
	}

}
