package org.hrm.admin;

import org.hrm.generic.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_1and2_Test extends BaseTest{
	@Test(groups = "smoke")
	public void ts_1_test() {
		
		Reporter.log("Test Script 1", true);
	}

	@Test(groups = "regression")
	public void ts_2_test() {
		Reporter.log("Test Script 2", true);
	}
}