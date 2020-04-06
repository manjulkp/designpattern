package com.designpattern.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.util.concurrent.Uninterruptibles;

public class BaseTest 
{
	
protected WebDriver driver;

@BeforeTest
public void setupDriver(){
    System.out.println(
            "*********************   Create WebDriver Instance - Do not forget system property   *******************"
    );
    
    System.setProperty("webdriver.gecko.driver", "/Users/purushi1.macbook/eclipse-api/Geeks/com.designpattern/src/test/resources/driver/chromedriver");
    ChromeOptions chromeOptions= new ChromeOptions();
	chromeOptions.addArguments("disable-infobars");
	
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/resources/driver/chromedriver 2");
	 this.driver = new ChromeDriver(chromeOptions);
	 
	
}


@AfterTest
public void quitDriver(){
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    this.driver.quit();
}

}