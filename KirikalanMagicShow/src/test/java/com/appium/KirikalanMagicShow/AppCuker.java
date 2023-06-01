package com.appium.KirikalanMagicShow;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class AppCuker {
	public static  AndroidDriver driver;
	public static void setUp() throws IOException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "13");
	    desiredCapabilities.setCapability("appium:automationName", "SibiRocks");
	    desiredCapabilities.setCapability("appium:appPackage", "com.google.android.youtube");
	    desiredCapabilities.setCapability("appium:appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	public static void main(String[] args) throws IOException {
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Search']")).click();
		driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("dun dun");
//		driver.findElement(MobileBy.AccessibilityId("com.google.android.youtube:id/search_edit_text")).sendKeys("hola");
		((AndroidDriver)driver).pressKeyCode(66);
		
//		driver.findElement(By.id("EVERGLOW (에버글로우) - DUN DUN MV - 3 minutes, 29 seconds - Go to channel - Stone Music Entertainment - 278M views - 3 years ago - play video")).click();
		driver.findElement(MobileBy.AccessibilityId("EVERGLOW (에버글로우) - DUN DUN MV - 3 minutes, 29 seconds - Go to channel - Stone Music Entertainment - 278M views - 3 years ago - play video")).click();
	}

}
