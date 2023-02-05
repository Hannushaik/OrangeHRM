package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingTitle_GoogleHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String applicationUrladdress="http://google.com";
		
		WebDriver driver;
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\msedgedriver.exe");
		
		 driver=new EdgeDriver();
		
		driver.get(applicationUrladdress);
		
		
		String actual_GoogleHomepageTitle=driver.getTitle();
		System.out.println(" Current  Google title is:"+ actual_GoogleHomepageTitle);
		
		String expected_GoogleHomepageTitle="Google";
		System.out.println(" expected Google title is:"+expected_GoogleHomepageTitle);
		
		
		
		String actual_GoogleUrlAddress=driver.getCurrentUrl();
		System.out.println("Google url address is:"+ actual_GoogleUrlAddress);
		
		
		String expected_GoogleUrladdress="google.com";
		System.out.println("  Expected Google Url Address is:"+expected_GoogleUrladdress);
		
		
		
		if(actual_GoogleHomepageTitle.equals(expected_GoogleHomepageTitle))
		{
			System.out.println(" Google title is same");
		}else
		{
			System.out.println(" Google title is not same ");
		}
		
		
		if(actual_GoogleUrlAddress.contains(expected_GoogleUrladdress))
		{
			System.out.println(" Google Url Address same");
		}else
		{
			System.out.println(" Google Url Address is not same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		

	}

}
