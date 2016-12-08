package lib.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage extends Page{

	//============ Mapping web elements ===========
	//@FindBy(css = "article#post-156 header h1")
	@FindBy(xpath = "id('post-156')/header/h1")
	private WebElement aboutAsHeader;
	
	
	//=============================================
	
	//============ Constructor ====================
	public AboutUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}

	/*
	 * isDisplayed Methods
	 */
	public boolean isDisplayedAboutUsHeader() {
		try {
			return aboutAsHeader.isDisplayed();
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	
	/*
	 * getText Methods
	 */
	
	public String getTextAboutUsHeader() {
		return aboutAsHeader.getText();
	}
}
