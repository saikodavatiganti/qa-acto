package login_page;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class valid_login extends app_launch {
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver<IOSElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByName("Log In").click();
        driver.findElementByAccessibilityId("domainTextField").sendKeys("apaiva");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
        driver.findElementByAccessibilityId("Continue").click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Continue")));
        driver.findElementByAccessibilityId("Continue").click();
        
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.AccessibilityId("Continue")));
//        driver.findElementByAccessibilityId("Continue").click();
        driver.findElementByAccessibilityId("email_field").sendKeys("sai+qa@actoapp.com");
        
        driver.findElementByName("Sign In With Email").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("pass_field").sendKeys("acto2017");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("Sign In").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        Alert(driver).accept()
        
        driver.findElementByAccessibilityId("Accept");
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	}


