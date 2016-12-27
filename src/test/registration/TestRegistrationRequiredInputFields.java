package test.registration;

import lib.data.Properties;
import lib.pages.HomePage;
import lib.pages.RegistrationPage;
import lib.util.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test case:
 * [Precondition]
 * -firstname,lastname (chars)
 * -username (chars)
 * -email (email@emai.com)
 * -phone number (starts with country code and has more than 10 numbers)
 * -password (more than 8 chars, with spec char, numbers and caps letters)
 * [Steps]
 * 1. Open Home page
 * 2. Open Registration page
 * 3. Fill in the required fields with correct values 
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
		registrationPage.selectCheckboxHobbyDance(true);
		registrationPage.selectCountry("Laos");
		
		registrationPage.sendKeysToPhoneNumberInput("00381641234567");
		registrationPage.sendKeysToUsernameField("jelenaTodorovic");
		registrationPage.sendKeysToEmailInput("jelena@todorovic.com");
		
		registrationPage.sendKeysToPasswordFiled("Matematicki123!*");
		registrationPage.sendKeysToConfirmPasswordField("Matematicki123!*");
		
		Sleeper.sleepTightInSeconds(4);
		
		registrationPage.clickOnSubmitButton();
		Sleeper.sleepTightInSeconds(4);
		Assert.assertEquals(registrationPage.isDisplayedSuccessRegistrationMsg(), true);
		Assert.assertEquals(registrationPage.getTextSuccessRegistrationMsg(), "Thank you for your registration" );
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
