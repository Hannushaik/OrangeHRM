package com.AutomatingDropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_DropDownApplication
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        String applicationUrlAddress="http://my.monsterindia.com/sponsered_popup.html";
        		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
			
	   // Maximize the broeser
		
		driver.manage().window().maximize();
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// identify the current location of DropDown
		//class="border_grey1"
		
		   By CurrentLocationL=By.className("border_grey1");
	     WebElement CurrentLocation=driver.findElement(CurrentLocationL);
	     //selection of a optinal value of dropdown-currentlocation
	     
	    Select   selectionCurrentLocation=new Select(CurrentLocation);
	    selectionCurrentLocation.selectByIndex(3);
	    // index of the dropdown starts with zero
	    //should be given with an argument of type string
	    // select by value- should be provided with property attribute
	    // value number-give by developer
	    
	    selectionCurrentLocation.selectByValue("492");
	    
	    // should be given with the name of the visible of the visible text of dropdown
	    
	    selectionCurrentLocation.selectByVisibleText("Agra");
	    
	    //Automating industry DropDown
	    // id="id_industry"
	    
	        By industryLocator=By.id("id_industry");
        	WebElement  industry=driver.findElement(industryLocator);
        	Select selectionindustry =new Select(industry);
        	
        	selectionindustry.selectByIndex(4);
        	selectionindustry.selectByValue("5");
	    
        	
        	
        	// deselect of selected optional value of the dropdown_indusrty
        	 selectionindustry.deselectAll();// used to deselect all selected optional values
        	
        	selectionindustry.deselectByVisibleText("other");
	        selectionindustry.deselectByIndex(4);
	        selectionindustry.deselectByValue("5");
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		driver.quit();
		
		
		
		

	}

}
