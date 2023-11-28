package org.hrm.admin;

import org.testng.annotations.Test;

public class TestScript_1and2_Test {
	@Test(groups = "smoke")
	public void ts_1_test() {
		System.out.println("Test Script 1");
	}

	@Test(groups = "regression")
	public void ts_2_test() {
		System.out.println("Test Script 2");
	}
}