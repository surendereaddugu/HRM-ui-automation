package com.oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		
//  specify the file location
		
		
		
		
		

	}

}
