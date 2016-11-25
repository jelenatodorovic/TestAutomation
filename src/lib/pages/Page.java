package lib.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	protected WebDriver _driver;
	//private String url;
	
	//================= Mapping web elements ===============
	@FindBy(id = "menu-item-158")
	private WebElement aboutUsLink;
	
	@FindBy(xpath = "id('menu-item-155')")	
	private WebElement servicesLink;

	//==================================================
	
	@FindBy(id = "menu-item-374")
	private WebElement registrationLink;
	
	
	// Constructor initializing web driver
	// And initializing web elements on current page
	public Page(WebDriver driver){
		this._driver = driver;
		PageFactory.initElements(_driver, this);
	}
	
	
	/*
	 * clickOn Methods
	 */
	public RegistrationPage clickOnRegistrationLink() {
		registrationLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new RegistrationPage(_driver);
		//return page
	}
	
	public AboutUsPage clickOnAboutUsLink() {
		aboutUsLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new AboutUsPage(_driver);
	}
}
