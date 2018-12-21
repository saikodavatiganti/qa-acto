package Acto_pages;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;

/**
 * 
 * 
 * 
 */
public class LoginPage {

	IOSDriver<?> driver;
	
	By EmailId = By.id("Email_id");
	By Password = By.id("Password");
	By Submit = By.id("Submit");
	
	
	public LoginPage(IOSDriver driver)
	{
		this.driver=driver;
		
	}
	public void typeemailid()
	{
		
		driver.findElement(EmailId).sendKeys("Sai+qa@actoapp.com");
		
	}
	public void typepassword()
	{
		driver.findElement(Password).sendKeys("acto2017");
		
	}
	public void submitbutton()
	{
		driver.findElement(Submit).click();
		
	}
}
