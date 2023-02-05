package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingFirstRowOfFirstColumnData
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
	
	public void getCityName()
	{
		// locator-x path
		//        - x path Expression
		//  selector- /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// absolute x path[html] tag
		
		By  cityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]");
		  WebElement   cityName=driver.findElement(cityNameLocator);
		  
		 String cityNameText=cityName.getText();
		 System.out.println(cityNameText);
			
	}
	
	public static void main(String[] args)
	{
		
		CapturingFirstRowOfFirstColumnData getData=new CapturingFirstRowOfFirstColumnData ();
		getData.applicationLaunch();
		getData.getCityName();
		getData.applicationclose();
		
	}
	
	
	
	
	
	
	
	
}
