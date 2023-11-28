package org.hrm.employee;

import org.hrm.generic.JavaUtils;
import org.testng.annotations.Test;

public class TestScript_Employee {
	JavaUtils juObj = new JavaUtils();

	@Test
	public void generateEmpId_1_Test() {
		String eId = juObj.getRandomId("AMC");
		System.out.println("Employee ID is : " + eId);
	}
}