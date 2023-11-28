package org.hrm.login;

import org.hrm.generic.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript_Login {
	WebDriver driver = new ChromeDriver();

	@Test
	public void login_1_Test() {
		WebDriverUtils wuObj = new WebDriverUtils();
		wuObj.launchTheBrowser(driver, "http://localhost:8080");
	}
	
	@Test
	public void closeBrowser() {
		WebDriverUtils wuObj = new WebDriverUtils();
		wuObj.closeTheBrowser(driver);
	}
}