package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_BingHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String applicationUrlAddress="http://bing.com";
		
		
		
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
 ChromeDriver driver =new ChromeDriver();
		
		
		driver.get(applicationUrlAddress);
		
		
		
		String actual_BingHomepageTitle=driver.getTitle();
		System.out.println(" actual Bing Homepage Titile is:"+actual_BingHomepageTitle);
		
		
		
		driver.quit();

	}

}
