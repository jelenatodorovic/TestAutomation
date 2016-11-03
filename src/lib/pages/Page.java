package lib.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	private WebDriver _driver;
	//private String url;
	
	@FindBy(id = "menu-item-158")
	private WebElement aboutUsLink;
	
	@FindBy(xpath = "id('menu-item-155')")	
	private WebElement servicesLink;

	//==================================================
	
	@FindBy(id = "menu-item-374")
	private WebElement registrationLink;
	
	@FindBy(id = "masthead")
	private WebElement siteNavigation;
	
	public Page(WebDriver driver){
		this._driver = driver;
		//System.out.println("Open page");
		//_driver.manage().window().maximize();
		PageFactory.initElements(_driver, this);
	}
	
	
	public boolean isDisplayedNavigation() {
		try {
			return siteNavigation.isDisplayed();
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public RegistrationPage clickOnRegistrationLink() {
		registrationLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new RegistrationPage(_driver);
		//return page
	}
}
