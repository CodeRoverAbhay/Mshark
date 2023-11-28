package org.hrm.admin;

import org.testng.annotations.Test;

public class TestScript_3and4_Test {
	@Test(groups = "smoke")
	public void ts_3_test() {
		System.out.println("Test Script 3");
	}

	@Test(groups = "regression")
	public void ts_4_test() {
		System.out.println("Test Script 4");
	}
}