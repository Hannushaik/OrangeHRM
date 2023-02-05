package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_BingHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String applicationUrlAddress="http://bing.com";
		
		WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
				
				
				driver.get(applicationUrlAddress);
				
				
				
				
				
				String expected_BingHomepageTitle="Bing";
				System.out.println("expected bing homepage title is:"+ expected_BingHomepageTitle);
				
				
				String actual_BingHomepageTitle=driver.getTitle();
				System.out.println(" actual Bing Homepage Titile is:"+actual_BingHomepageTitle);
				
				
				
				String actual_BingUrlAddress=driver.getCurrentUrl();
				System.out.println("actual Bing Url Address is:"+actual_BingUrlAddress);
				
				String expected_BingUrlAddress="bing.com";
				System.out.println(" expected bing url address is :"+ expected_BingUrlAddress);
				
				
				
				
				
				
				
				
				if(actual_BingHomepageTitle.equals(expected_BingHomepageTitle))
				{
					System.out.println(" Bing Titile is matched");
					
				}
				else
				{
					System.out.println(" Bing Title is not matched");
				}
				
				
				if(actual_BingUrlAddress.contains(expected_BingUrlAddress))
				{
					System.out.println(" Bing Url Address Is Same");
				}
				else
				{
					System.out.println(" Bing Url Address Is Not Same");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				driver.quit();

		
		
		
		
		
		
		

	}

}
