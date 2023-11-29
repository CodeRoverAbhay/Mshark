package org.hrm.admin;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_3and4_Test {
	@Test(groups = "smoke")
	public void ts_3_test() {
		Reporter.log("Test Script 3", true);
	}

	@Test(groups = "regression")
	public void ts_4_test() {
		Reporter.log("Test Script 4", true);
	}
}