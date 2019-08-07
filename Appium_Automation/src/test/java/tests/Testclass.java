package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Testclass {
	
	static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "Abhi Phone");
				caps.setCapability("udid", "FXYDU17916004799"); //Give Device ID of your mobile phone
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "9.0");
				caps.setCapability("appPackage", "com.wdc.ibi");
				caps.setCapability("appActivity", "com.kamino.wdt.MainActivity");
				caps.setCapability("noReset", "true");
				caps.setCapability("unicodeKeyboard", true);
				caps.setCapability("resetKeyboard", true);
				
				//Instantiate Appium Driver
	
				try {	
						

						URL url= new URL("http://0.0.0.0:4723/wd/hub");
						driver = new AndroidDriver<MobileElement>(url, caps);
						
						//WebDriverWait wait = new WebDriverWait(driver, 10);
						driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
						//driver.findElementByClassName("android.widget.TextView").click();
						//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text ='I Agree']"))).click();
						//driver.findElement(By.xpath("//*[@text ='I Agree']")).click();
						//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text ='SIGN IN']"))).click();
						driver.findElement(By.xpath("//*[@text ='SIGN IN']")).click();
						driver.findElement(By.xpath("//*[@text ='Email address']")).sendKeys("mobappw+abtest@gmail.com");
						driver.findElement(By.xpath("//*[@text ='Password']")).sendKeys("Admin@555");
						driver.findElement(By.xpath("//*[@text ='CONTINUE']")).click();
						System.out.println("Signed In Successfuly");
						
						
						
				} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
				}		
			
	}
	
	@Test
	public void sampleTest() {
		System.out.println("Im Working.....");
	}
	
}
