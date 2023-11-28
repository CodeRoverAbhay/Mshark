package org.hrm.employee;

import org.practice.generic.JavaUtils;
import org.testng.annotations.Test;

public class TestScript_Employee_Test {
	JavaUtils juObj = new JavaUtils();

	@Test
	public void generateEmpId_1_Test() {
		String eId = juObj.getRandomId("AMC");
		System.out.println("Employee ID is : " + eId);
	}
}