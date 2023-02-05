package com.ValidateBingUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BingUrlAddress {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String applicationUrlAddress="http://bing.com";
		
		WebDriver driver;
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\msedgedriver.exe");
		 driver=new EdgeDriver();
		
		
		driver.get(applicationUrlAddress);
		
		
		
		
		String expected_BingHomepageUrlAddress="bing.com";
		System.out.println(" expected url address is:"+expected_BingHomepageUrlAddress );
		
		String actual_BingCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println("actual url address is :"+actual_BingCurrentUrlAddress );
		
		if(actual_BingCurrentUrlAddress.contains(expected_BingHomepageUrlAddress))
		{
			System.out.println("url address matched--pass");
		}
		else
		{
			System.out.println("url address not matched");
		}
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
