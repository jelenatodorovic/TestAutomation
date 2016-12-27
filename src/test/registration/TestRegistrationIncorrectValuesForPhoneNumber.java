package test.registration;

import lib.data.Properties;
import lib.pages.HomePage;
import lib.pages.RegistrationPage;
import lib.util.Browser;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Test case:
 * [Precondition]
 
 * [Steps]
 * 1. Open Home page
 * 2. Open Registration page
 * 3. Fill in phone number input field with incorrect values
 * 4. Check error message is displayed
 * 
 * [Expected Result]
 * Error message is displayed and submit button is disabled?
 * 
 * @author jelena.todorovic
 *
 */

/*
 * Every test class written using testNG should at least contains 3 methods:
 * 		setUp, test, tearDown annotated with @BeforeClass, @Test, @AfterClass, executed in that order.
 * 
 * @BeforeClass should set up environment for test
 * @Test should execute test and include VERIFICATION
 * @AfterClass should revert changes that script made and clean up
 * 
 * 
 * For verification we use Assert class,
 * and method assertEquals(actualValue, expectedValue);
 * assertEquals(..) checks if actualValue and expectedValue are equal,
 * if they are verification will PASS, if not verification will FAIL.
 * 
 * ActualValue is value we find on web application that we are testing.
 * ExpectedValue is value that should be on web application by design.
 * 
 * 
 * 
 * 
 */
public class TestRegistrationIncorrectValuesForPhoneNumber {
 
	WebDriver driver;
	HomePage homePage;
	RegistrationPage registrationPage;
	
	@BeforeClass
	public void setUp() {
		driver = Browser.openBrowser(Properties.URL);
	}
	
	@Test
	public void f() {
		homePage = new HomePage(driver);
		registrationPage = homePage.clickOnRegistrationLink();
		
		registrationPage.sendKeysToPhoneNumberInput(Properties.value1);
		
		registrationPage.clickOnSubmitButton();
		
		Assert.assertEquals(registrationPage.isDisplayedPhoneNumberErrorMsg(), true);
		
		registrationPage.clearPhoneNumberInputField();
		
		registrationPage.sendKeysToPhoneNumberInput(Properties.value2);
		
		registrationPage.clickOnSubmitButton();
		
		Assert.assertEquals(registrationPage.isDisplayedPhoneNumberErrorMsg(), true);
		
		registrationPage.clearPhoneNumberInputField();
		
		registrationPage.sendKeysToPhoneNumberInput(Properties.value3);
		
		registrationPage.clickOnSubmitButton();
		
		Assert.assertEquals(registrationPage.isDisplayedPhoneNumberErrorMsg(), true);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
