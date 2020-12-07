package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String Mainwindowid=driver.getWindowHandle();
		System.out.println("Mainwindowid:"+Mainwindowid);
		
		driver.findElement(By.id("windowButton")).click();
		
          // Multiple Windows
		Set<String> allwindows=driver.getWindowHandles();
		String childwindow=null;
		int windowcount=allwindows.size();
		System.out.println("windowcount:"+windowcount);
		
		Iterator<String> itr=allwindows.iterator();
		while(itr.hasNext())
		{
			childwindow=itr.next();
			System.out.println(childwindow);
			
		}
		if(!Mainwindowid.equals(childwindow));
		{
			driver.switchTo().window(childwindow);
			String childwindowtext=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(childwindowtext);
			driver.switchTo().defaultContent();
			
			
		}
		
		
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object println(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
