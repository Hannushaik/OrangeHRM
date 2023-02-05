package com.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class RadioButtonTesting {

	public static void main(String[] args)
	{
		
		
		WebDriver driver;
		String applicationUrlAddress="http://echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// delete all cookies
		driver.manage().deleteAllCookies();
		
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese">
		//<input type="radio" name="group2" value="Water">
		
		      // identifying the group1 Radio Buttons
	   By group1RadioButtonslocator=By.name("group1");
	   List<WebElement> group1RadioButtons  = driver.findElements(group1RadioButtonslocator);
    	int   group1RadioButtonsCount=group1RadioButtons.size();
    	System.out.println("The no of Radio Button of group1 is:"+group1RadioButtonsCount);
    	
    	for(int index=0; index<group1RadioButtonsCount; index++)
    	{
          	String	radioButtonName=group1RadioButtons.get(index).getAttribute("value");
    		System.out.println(index+" "+radioButtonName);
    	}
		
	
	}

}
