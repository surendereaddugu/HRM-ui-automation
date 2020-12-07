package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//verify user able to launch the application in firefox
		
		//Configure browser driver exe file
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.fb.com");
	}

}
