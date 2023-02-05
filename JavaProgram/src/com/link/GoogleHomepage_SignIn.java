package com.link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepage_SignIn
  {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String applicationUrlAddress="http://google.com";
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.get(applicationUrlAddress);
		 
		 
		 
		 
		 //<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp"
	     //	+ ";continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" target="_top">Sign in</a>
		 //a= anchor Tag
		 // href=attribute
		 //value=https://www.google.com/&GAZAmgQ
		 // Type of element=link
		//locator=linktest
		 //selector=Sign in
		 
		
		  By signInL=By.linkText("Sign in");
		  WebElement SignIn1= driver.findElement(signInL);
		  SignIn1.click();
		  
		  // getting the text of the SignIn Element
		 String SighIn_Test=SignIn1.getText();
		 System.out.println("The text of the element SignIn is:"+SighIn_Test);
		 
		 
		 //getting the href attribute value of SignIN element
		 
		   String SignIn_AttributeValueOFHref=SignIn1.getAttribute("href");
		   System.out.println(" attribute valueof href of sign in element is:"+SignIn_AttributeValueOFHref);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
