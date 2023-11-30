package org.hrm.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	@Test
	public void launchBrowserTest() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Crome Driver is Launched Successfully.", true);
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Edge Driver is Launched Successfully.", true);
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("Firefox Driver is Launched Successfully.", true);
		} else {
			driver = new ChromeDriver();
			Reporter.log("Default Crome Driver is Launched Successfully.", true);
		}
		driver.manage().window().maximize();
		driver.get(URL);
		String currentUrl = driver.getCurrentUrl();
		Reporter.log(currentUrl, true);
		driver.quit();
	}
}