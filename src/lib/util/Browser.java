package lib.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver openBrowser(String url) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get(url);
		System.out.println("Opening " + url + "page");
		return d;
	}
}
