package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_CheckAvailabilityAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String appicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appicationUrlAddress);
		
		// maximize
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// id="searchBtn"
		 By checkAvailibilityL=By.id("searchBtn");
		 WebElement checkAvailibilityButton =driver.findElement(checkAvailibilityL);
		 checkAvailibilityButton.click();
		 // handling Alert- to handle alert window -switch into alert
		 
		 Alert alert=driver.switchTo().alert();
		 
		 Thread.sleep(5000);
		 // will perform opertion on OK Button
		 alert.accept();
		 // will perform for cancel
		 // alert.dismiss();
		// alert.sendKeys(appicationUrlAddress);-  perform for sendin text data
		 
		 //<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		
	    	 By EnquiryL=By.linkText("Enquiry");
	    WebElement enquiry= driver.findElement(EnquiryL);
	    enquiry.click();
	   //<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a> 
	    
	    Thread.sleep(5000);
	   By cancelTicketsL= By.linkText("Cancel Tickets");
	    WebElement cancelTicketspage= driver.findElement(cancelTicketsL);
	    cancelTicketspage.click();
	    
	    
		
		driver.quit();
		
		
		
		
		

	}

}
