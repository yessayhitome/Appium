package com.appium.KirikalanMagicShow;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class classyt {
	  public static  AndroidDriver driver;
	  public static void setUp() throws MalformedURLException {
		    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("appium:platformVersion", "13");
		    desiredCapabilities.setCapability("appium:deviceName", "Gphone");
		    desiredCapabilities.setCapability("appium:automationName", "Pixel Pro");
		    desiredCapabilities.setCapability("appium:appPackage", "com.google.android.youtube");
		    desiredCapabilities.setCapability("appium:appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
		    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		  }
	  public static void main(String[] args) throws IOException {
		  setUp();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'Search\']")).click();
		  driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("va vathi somg");
		  ((AndroidDriver)driver).pressKeyCode(66);
		  driver.findElement(MobileBy.AccessibilityId("Vaa Vaathi Full Video Song | Vaathi Movie | Dhanush, Samyuktha | GV Prakash Kumar | Venky Atluri - 3 minutes, 15 seconds - Go to channel - Aditya Music Tamil - 64M views - 2 months ago - play video")).click();
	}
}
