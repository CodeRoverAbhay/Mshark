package org.hrm.login;

import org.hrm.generic.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_Login {
	WebDriver driver = new ChromeDriver();

	@Test
	public void login_1_Test() throws InterruptedException {
		WebDriverUtils wuObj = new WebDriverUtils();
		wuObj.launchTheBrowser(driver, "https://www.bing.com");
		Reporter.log("Browser is Launched", true);
		Thread.sleep(4000);
		driver.quit();
	}

}