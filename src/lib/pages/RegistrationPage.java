package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Page{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		System.out.println("Open Registration Page");
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
}
