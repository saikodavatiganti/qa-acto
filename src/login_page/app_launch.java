package login_page;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class app_launch {
 
	

	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException
	{	
		IOSDriver<IOSElement>driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "User's iPhone");
//		capabilities.setCapability(MobileCapabilityType.UDID,"fd3f2acc342a54bd8c97907789950b998214a15b");
		
		capabilities.setCapability(MobileCapabilityType.APP, "//Users//user//Desktop//ACTO.app");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

			}

}
