package org.hrm.employee;

import org.hrm.generic.JavaUtils;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_Employee_Test {
	JavaUtils juObj = new JavaUtils();

	@Test (groups = "regression")
	public void generateEmpId_1_Test() {
		String eId = juObj.getRandomId("AMC");
		Reporter.log("Employee ID is : " + eId, true);
	}
}