package com.usitsolutions.projects.appiumtest;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumDriverProvider {

	/**
	 * @param args
	 */
	private static WebDriver driver;
	private static AppiumDriver appiumDriver;
	private static final String APP_PACKAGE = "com.monitise.client.android.tefbr";
	private static final String APP_MAIN_ACTIVITY = "com.monitise.client.android.TReferenceBrandPackageT.modules.registration.LoadingActivity";
	private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";
	private static String sessionId;
	
	public void run() throws MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("Ran the main program");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformVersion", "4.3");
        
        //String userDir = System.getProperty("user.dir");
        String localApp = "tefbr.apk";
        
        String userDir = "//Users//dakojuu//Android-App";
        String appPath = Paths.get(userDir, localApp).toAbsolutePath().toString();
        System.out.println("App path is :-" + appPath);
        capabilities.setCapability("app", appPath);
        URL serverAddress;
        
        serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(serverAddress, capabilities);

        sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
        System.out.println("The session ID is :-" + sessionId);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //driver.findElement(By.id("com.monitise.client.android.clement:id/button_get_started")).click();
	}
}
