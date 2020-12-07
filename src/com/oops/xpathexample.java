package com.oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpathexample {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("No, thanks")).click();
        
        WebElement customer=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
        Actions act=new Actions(driver);
        act.moveToElement(customer).build().perform();
       driver.findElement(By.xpath("(//a[@onclick='userregister'()])[2]")).click();
       
      
        
        
        
	}
}
