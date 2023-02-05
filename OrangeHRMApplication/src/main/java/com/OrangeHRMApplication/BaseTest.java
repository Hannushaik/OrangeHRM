package com.OrangeHRMApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;



public class BaseTest
{
	
	 public 	WebDriver driver;
		
		String applicationUrlAddress=" http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		
		
		@BeforeTest
		public void setup()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe" );
		
		
		driver =new ChromeDriver();
		
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 Log.info("successfully navigate to orangeloginpage");
		}
		@AfterTest
		public void teardown()
		{
			//driver.quit();
		Log.info("successfully OrangeHrm Application Closed success");
		}


}
