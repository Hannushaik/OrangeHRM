package com.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginPage
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		

		String applicationUrlAddress=" http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe" );
		
		
		driver =new ChromeDriver();
		
		
		driver.get(applicationUrlAddress);
		
		//validate OrnageHRM Title
		
		String expected_OrangeHRMTitle="OrangeHRM";
		System.out.println(" expected Orange hrm title is:"+ expected_OrangeHRMTitle);
		
		
		String actual_OrangeHRMTitle=driver.getTitle()	;	
		System.out.println(" current OrnageHRM title is:"+ actual_OrangeHRMTitle);
		
		// validate OrangeHRMUrlAddress
		
		
		String expected_OrangeHRMUrlAddress="orangehrm";
		System.out.println(" OrangeHRM url address is:"+  expected_OrangeHRMUrlAddress );
		
		String actual_OrangeHRMUrlAddress=driver.getCurrentUrl();
		System.out.println(" current OrangeHRM is:"+actual_OrangeHRMUrlAddress);
		
		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println(" Title is not same");
		}
		
		
		
		if(actual_OrangeHRMUrlAddress.contains(expected_OrangeHRMUrlAddress))
		{
			System.out.println("OrangeHRM url address is same");
		}
		else
		{
			System.out.println("OrangeHRM url address not same");
		}
		
		
		
		
		// Inspected UserName Element Properties
		
	//	<input name="txtUsername" id="txtUsername" type="text">
		
		// locator=id (Attribute)
		// selector=txtUsername (value)
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Hannusk");
		
		// Automating Password
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		String passwordTestData="Hannu";
		
		
		
	
		driver.findElement(By.name("txtPassword")).sendKeys("Hannu012001@");
		
		// Automating Login Button
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		
		driver.findElement(By.className("button")).click();
		
	
		
		

		//driver.quit();

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
