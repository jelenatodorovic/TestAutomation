package test.prvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class PrviTest {

	
	WebDriver driver;
	String url;
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		url = "http://demoqa.com/";
		driver.get(url);
		System.out.println("Opening demoqa.com page..");

	}

	@Test
	public void f() {

		WebElement aboutUsLink = driver.findElement(By.id("menu-item-158"));
		aboutUsLink.click();

		WebElement header = driver.findElement(By
				.xpath("id('post-156')/header/h1"));

		Assert.assertEquals(true, header.isDisplayed());
	}
 

	@AfterClass()
	public void afterClass() {
		driver.close();
	}

}
