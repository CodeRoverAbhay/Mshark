package org.hrm.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest {
	WebDriver driver;

	public void launchBrowserTest() {
		driver = new ChromeDriver();
		driver.get("https://www.bing.com");
	}
}