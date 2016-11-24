package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page{

	@FindBy(id = "ui-id-1")
	private WebElement tab1;
	
	public HomePage(WebDriver driver) {
		super(driver);
		System.out.println("Open Home Page");
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnTab1() {
		tab1.click();
	}

}
