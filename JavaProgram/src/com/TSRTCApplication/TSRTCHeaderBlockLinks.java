package com.TSRTCApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTCHeaderBlockLinks {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		String applicationurl = "https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(applicationurl);
		
		  By TSRTCHomepageL=By.tagName("a");
		  
		  List<WebElement>  TSRTCHomepagelinks=driver.findElements(TSRTCHomepageL);
		  
		       
		   int  TSRTCHomepageLinksCount=TSRTCHomepagelinks.size();
		   
		   
		  System.out.println(TSRTCHomepageLinksCount);
		  
		  
		  for(int index =1;index<TSRTCHomepagelinks.size() ;index++ )
		  {
		     // getting the visible elements of the headerblock
			  if(TSRTCHomepagelinks.get(index).isDisplayed())
			  {
			 String TSRTCHomepageLinkName=TSRTCHomepagelinks.get(index).getText();
			  System.out.println(TSRTCHomepageLinkName);
			 //TSRTCHomepagelinks.get(index).click();
			
			 System.out.println(index+ TSRTCHomepageLinkName);
		  }
		  
		  }
		  
		  
		   
		   
		     
		
		  
		
		
		
		
	}

}
