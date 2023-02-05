package com.GoogleHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_SignIn {

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
		}
		else
		{
			System.out.println(" Google title is not same ");
		}
		
		
		if(actual_GoogleUrlAddress.contains(expected_GoogleUrladdress))
		{
			System.out.println(" Google Url Address same");
		}
		else
		{
			System.out.println(" Google Url Address is not same");
		}
		
		
		
		//<a = href="https://accounts.google.com/ServiceLogin?hl=en&amp;
		//passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top">Sign in</a>
		
		// types of element value= link
		// locator= linktest
		// selector=Sign in
		
		  By SignInL = By.linkText("Sign in");
		 WebElement SignIn =driver.findElement(SignInL);
		  SignIn.click();
		
		
		
		
	    // By	 SignInL=By.partialLinkText("Sign");
	    //WebElement SignIn= driver.findElement(SignInL);
	    //SignIn.click();
		
	   // String	SIgnIn_Test=SignIn.getText();		
		 //System.out.println(" sign in text is:"+SIgnIn_Test);
		
		
		
		
	 //<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" autocapitalize="none" 
		 //   id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		
		//id="identifierId"
		
		
		String TestData="shaikaryan62509@gmail.com";
		
	    By IdLocator=By.id("identifierId");
		 WebElement Id=driver.findElement(IdLocator);
		Id.sendKeys(TestData);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       // driver.quit();
	}

}
