package com.appium.KirikalanMagicShow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Selenoid {
	
	public static AndroidDriver driver;

	  public static void setUp() throws MalformedURLException {
		  
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "13");
	    desiredCapabilities.setCapability("appium:deviceName", "Pixel");
	    desiredCapabilities.setCapability("appium:automationName", "Pixel 6");
	    desiredCapabilities.setCapability("appium:appPackage", "io.selendroid.testapp");
	    desiredCapabilities.setCapability("appium:appActivity", "io.selendroid.testapp.HomeScreenActivity");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }
	
	public static void main(String[] args) throws MalformedURLException {
		
		setUp();
		
		WebElement regristration = driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		regristration.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		username.sendKeys("Appium");
		
		WebElement email = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		email.sendKeys("appiumstudio@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		pwd.sendKeys("Studio");
		
		WebElement name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.clear();
		name.sendKeys("Emulator");
		
		driver.navigate().back();
		
        WebElement program = driver.findElement(By.id("android:id/text1"));
        program.click();
        
		WebElement language = driver.findElement(By.xpath("//*[@text='Java']"));
	    language.click();
	    
	    WebElement accept = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));
	    accept.click();
	    
	    WebElement regrister = driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
	    regrister.click();
		
	}

}
