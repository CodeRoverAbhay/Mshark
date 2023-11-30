package org.hrm.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserTest {
	WebDriver driver;

	@Test
	public void launchBrowserTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		System.out.println("Driver is launched.");
		driver.quit();
	}
}