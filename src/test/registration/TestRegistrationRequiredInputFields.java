package test.registration;

import lib.data.Properties;
import lib.pages.HomePage;
import lib.pages.RegistrationPage;
import lib.util.Browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test case:
 * [Precondition]
 * 
 * [Steps]
 * 1. Open Home page
 * 2. Open Registration page
 * 3. Fill in the required filds 
 * 		(firstname, lastname, hobby, phone number, 
 * 		username, email, password, confirm password)
 * 4. Click Submit
 * 5. Check user is registered
 * 
 * [Expected Result]
 * User is successfully added
 * 
 * @author jelena.todorovic
 *
 */
public class TestRegistrationRequiredInputFields {

	WebDriver driver;
	HomePage homePage;
	RegistrationPage registrationPage;
	
	@BeforeClass
	public void setUp() {
		// Open Browser
		driver = Browser.openBrowser(Properties.URL);
	}
	
	@Test
	public void test() {
		homePage = new HomePage(driver);
		registrationPage = homePage.clickOnRegistrationLink();
		
		registrationPage.sendKeysToFirstNameField("nesto");
		registrationPage.sendKeysToLastNameField("nesto");
		
		registrationPage.selectMaritalStatus("married");
		registrationPage.selectCheckboxHobbyDancing(true);
		registrationPage.selectCountry("Laos");
		
		registrationPage.sendKeysToUsernameField("slsl");
		registrationPage.sendKeysToPasswordFiled("nesto");
		registrationPage.sendKeysToConfirmPasswordField("nesto");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
	}
}
