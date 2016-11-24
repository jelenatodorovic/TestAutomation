package test.drugi;


import lib.data.Properties;
import lib.pages.AboutUsPage;
import lib.pages.HomePage;
import lib.pages.Page;
import lib.pages.RegistrationPage;
import lib.util.Browser;










import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DrugiTest {

	WebDriver driver;
	
	HomePage homePage;
	AboutUsPage aboutUsPage;
	RegistrationPage registratrionPage;
	
	@BeforeClass
	public void setUp()	{
	
		// Open Browser
		driver = Browser.openBrowser(Properties.URL);
		System.out.println("Before: "+  driver);
	}
	
	@Test
	public void test() {
		try {
			// Open Home page
			homePage = new HomePage(driver);
			aboutUsPage = homePage.clickOnAboutUsLink();
			
			// check if page is opened
			Assert.assertEquals(aboutUsPage.isDisplayedAboutUsHeader(), true);
			Assert.assertEquals(aboutUsPage.getTextAboutUsHeader(), "About us");
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
