package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapuringAllWebTableData
{
	
	

	
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}
	
	public void applicationclose()
	{
		driver.close();
	}
	 public void getCompleteWebTableData()
	 {
		 // first row of first columnn  
		 // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		 
		 // last row of last column
		 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		 
		 // to go all the row of web table
		 
	 for(int index=1;index<=36;index++)
	{
			 
	 for(int rowOfCell=1; rowOfCell<7; rowOfCell++)
	{
		 
			 
	   By  WebTableL= By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td["+rowOfCell+"]");
	   WebElement   WebTable= driver.findElement(WebTableL);
	   String    WebTableData=WebTable.getText();
	   System.out.print( WebTableData);
			     
			    		 
			 }
			 System.out.println();
		 }
		 
		
		 
	 }
	
	public static void main(String[] args) {
		 
		 CapuringAllWebTableData getData=new CapuringAllWebTableData();
		 getData.applicationLaunch();
		 getData.getCompleteWebTableData();
		  getData.applicationclose();
		  
		  
		  
	}
	
	
	
	
	
	
	

}
