package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	 driver.get("https://jqueryui.com/droppable/");
	 driver.manage().window().maximize();
	 
	 WebElement mainframe=driver.findElement(By.className("demo-frame"));
	 
	 
// Switch to frame
	 
	 driver.switchTo().frame(mainframe);
	 
// Identify drag Element
	 WebElement Source=driver.findElement(By.id("draggable"));
	 
// Identify the Drop point
	  WebElement Destination=driver.findElement(By.id("droppable"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(Source, Destination).build().perform();
	  
	 
	 
	 

	}

}
