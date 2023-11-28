package org.hrm.generic;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
	public void launchTheBrowser(WebDriver driver, String URL) {
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public void closeTheBrowser(WebDriver driver) {
		driver.manage().window().minimize();
		driver.quit();
	}
}