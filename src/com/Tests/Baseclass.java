package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Verify user able to launch the Application in Chrome browser
		
		//Configure browser driver exe file
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}
	}


