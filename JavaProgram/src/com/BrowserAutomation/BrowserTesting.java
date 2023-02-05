package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTesting
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe" );
   ChromeDriver chromeBrowser=new ChromeDriver();
  
    chromeBrowser.get("http://bing.com");
    chromeBrowser.get("http://google.com");
    chromeBrowser.get("http://facebook.com");
  
	chromeBrowser.navigate().to("http://livetech.in");	
	
	
	chromeBrowser.close();
	
	
	chromeBrowser.quit();
		
		
		
		

	}

}
