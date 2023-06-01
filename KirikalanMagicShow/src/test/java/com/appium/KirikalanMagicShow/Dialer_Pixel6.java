package com.appium.KirikalanMagicShow;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Dialer_Pixel6 {
	
	public static AndroidDriver driver;

	    public static void setUp() throws IOException {
//	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//	    desiredCapabilities.setCapability("platformName", "Android");
//	    desiredCapabilities.setCapability("appium:platformVersion", "13");
//	    desiredCapabilities.setCapability("appium:deviceName", "Gphone");
//	    desiredCapabilities.setCapability("appium:automationName", "Pixel 6");
//	    desiredCapabilities.setCapability("appium:appPackage", "com.google.android.dialer");
//	    desiredCapabilities.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
//	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
//	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
//	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
	    	
	    	 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    	    desiredCapabilities.setCapability("platformName", "Android");
	    	    desiredCapabilities.setCapability("appium:platformVersion", "13");
	    	    desiredCapabilities.setCapability("appium:deviceName", "Gphone");
	    	    desiredCapabilities.setCapability("appium:automationName", "Pixel 6");
	    	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\sathi\\eclipse-workspace\\KirikalanMagicShow\\src\\Apk\\amazon-shopping-26-11-0-100.apk");
	    	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }
	    
	    public static void main(String[] args) throws IOException {
			
	    	setUp();
	    	
	    	System.out.println("done");
	    	
	    	//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
	    	
	    	//driver.findElement(By.id("com.google.android.dialer:id/one")).click();
		}

}
