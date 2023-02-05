package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRMApplicationLogInTest
 {
    Properties property;
    WebDriver driver;
	
    @Parameters("Browser")
	
	@Test
	public void logInTest(String browserName) throws MalformedURLException
	{
		System.out.println("The name of the browser is:"+browserName);
		//DesiredCapabilities-class should be set with browser and platform
		
		DesiredCapabilities cap=null;
		
		if(browserName.equals("chrome"))
		{
			// Node
			
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else
			if(browserName.equals("firefox"))
			{
				// Node
				
				cap=DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
				
				RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.100.5/wd/hub"), cap);
				String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
				driver.get(applicationUrlAddress);
				
			}
		
		
	}
	
            @Test
	        public void LoginTest()
	        {
        	  String UsernameTestdata="Hannusk";
  		      By UserNameL=By.id(property.getProperty("userNameProperty"));
  		      WebElement UserName= driver.findElement(UserNameL);
              UserName.sendKeys(UsernameTestdata);
              
              
              String passwordTestData="Hannu012001@";
              By  PasswordLocator=By.id(property.getProperty("passwordNameProperty"));
              WebElement Password=driver.findElement(PasswordLocator);
              Password.sendKeys(passwordTestData);
              
              By LoginL1=By.className(property.getProperty("logInButtonProperty"));
    		  WebElement  Loginn=driver.findElement(LoginL1);
    		  Loginn.click();
             
        	 
        	 
		
		
        }
	
	
	

}
