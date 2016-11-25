package lib.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Page{
	
	//================ mapping web elements ================
	@FindBy(xpath = "id('pie_register')/li[1]/div[1]/label")
	private WebElement firstNameLabel;
	
	@FindBy(id = "name_3_firstname")
	private WebElement firstNameInput;
	
	@FindBy(xpath = "id('pie_register')/li[1]/div[1]/div[1]/label")
	private WebElement lastNameLabel;
	
	@FindBy(id = "name_3_lastname")
	private WebElement lastNameInput;
	
	@FindBy(css = "")
	private WebElement maritalStatus;
	
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[1]")
	private WebElement hobbyDancing;
	
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[2]")
	private WebElement hobbyReading;
	
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[3]")
	private WebElement hobbyCricket;
	
	@FindBy(id = "dropdown_7")
	private WebElement selectCountry;
	
	@FindBy(id = "phone_9")
	private WebElement phoneNumberInput;
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "email_1")
	private WebElement emailInput;
	
	@FindBy(id = "password_2")
	private WebElement passwordInput;
	
	@FindBy(id = "confirm_password_password_2")
	private WebElement confirmPasswordInput;
	
	private String single = "Single";
	private String married = "Married";
	private String divorced = "Divorced";
	
	// =============== Constructor ==========================
	public RegistrationPage(WebDriver driver) {
		super(driver);
		System.out.println("Open Registration Page");
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	/*
	 * sendKey Methods
	 */
	public void sendKeysToFirstNameField(String firstname) {
		firstNameInput.sendKeys(firstname);
	}
	public void sendKeysToLastNameField(String lastname) {
		lastNameInput.sendKeys(lastname);
	}
	public void sendKeysToPhoneNumberInput(String phoneNumber) {
		phoneNumberInput.sendKeys(phoneNumber);
	}
	public void sendKeysToUsernameField(String username) {
		usernameInput.sendKeys(username);
	}
	public void sendKeysToEmailInput(String email) {
		emailInput.sendKeys(email);
	}
	public void sendKeysToPasswordFiled(String password) {
		passwordInput.sendKeys(password);
	}
	public void sendKeysToConfirmPasswordField(String confirmPassword) {
		confirmPasswordInput.sendKeys(confirmPassword);
	}
	/*
	 * selectRadio Method
	 */
	
	public void selectMaritalStatus(String maritalStatus) {
		List<WebElement> listOfInputs = _driver.findElements(By.xpath("id('pie_register')/li[2]/div/div/input"));
		if(maritalStatus.equalsIgnoreCase(this.single)) {
			//select single
			listOfInputs.get(0).click();
		}
		else if(maritalStatus.equalsIgnoreCase(this.married)) {
			//select married
			listOfInputs.get(1).click();
		}
		else {
			//select divorced
			listOfInputs.get(2).click();
		}
	}
	
	/*
	 * selectCheckbox method
	 */
	public void selectCheckboxHobbyReading(boolean bValue) {
		
	}
	public void selectCheckboxHobbyDancing(boolean bValue) {
		
	}
	public void selectCheckboxHobbyCricket(boolean bValue) {
		
	}
	
	/*
	 * selectItem from list method
	 */
	public void selectCountry(String country) {
		Select select = new Select(selectCountry);
		select.selectByValue(country);
	}
	
}
