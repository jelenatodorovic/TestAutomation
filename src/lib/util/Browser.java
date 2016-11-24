package lib.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	/*
	 * Open Firefox Browser
	 * @return WebDriver
	 */
	public static WebDriver openBrowser(String url) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Opening " + url + "page");
		return driver;
	}
}
