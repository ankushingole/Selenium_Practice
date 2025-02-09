package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TC_01_FirefoxBrowserTest {
	static WebDriver driver;

	@Test
	public void launchFirefoxHeadless() {

		// Launch firefox in Headless mode
		FirefoxBinary binary = new FirefoxBinary();
		binary.addCommandLineOptions("--headless");

		FirefoxOptions options = new FirefoxOptions();
		options.setBinary(binary);
		driver = new FirefoxDriver(options);
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
