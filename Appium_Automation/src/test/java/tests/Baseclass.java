package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Baseclass {
	
	public static void main(String[] args) {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "FA7BB1A04373"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("appPackage", "com.wdc.ibi");
		caps.setCapability("appActivity", "com.kamino.wdt.MainActivity");
		caps.setCapability("noReset", "true");
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("resetKeyboard", true);
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				//driver.findElementByClassName("android.widget.TextView").click();
				driver.findElement(By.xpath("//*[@text ='SIGN IN']")).click();
				driver.findElement(By.xpath("//*[@text ='Email address']")).sendKeys("mobappw+b329@gmail.com");
				driver.findElement(By.xpath("//*[@text ='Password']")).sendKeys("Admin@555");
				driver.findElement(By.xpath("//*[@text ='CONTINUE']")).click();
				System.out.println("Signed In Successfuly");
				
				
				
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}

