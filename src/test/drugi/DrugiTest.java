package test.drugi;

import lib.pages.Page;
import lib.pages.RegistrationPage;
import lib.util.Browser;





import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DrugiTest {

	WebDriver driver;
	String url;
	Page page;
	RegistrationPage registratrionPage;
	
	@BeforeClass
	public void setUp()	{
		url = "http://demoqa.com";
		driver = Browser.openBrowser(url);
		System.out.println("Before: "+  driver);
	}
	
	@Test
	public void test() {
		try {
			
			page = new Page(driver);
			registratrionPage = page.clickOnRegistrationLink();
			} catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
