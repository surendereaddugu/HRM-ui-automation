package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusablefunctions {
	
	// Browser navigate
	public static WebDriver driver;
	public static void navigatetobrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}
		
		else 
		{
			System.out.println("Unable to navigate browser");
			
		}
	}

}
