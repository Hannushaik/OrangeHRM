package com.LinkTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_Links
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
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
		
		Thread.sleep(1000);
		File TSRTCHomepagescreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(TSRTCHomepagescreenshot,new File("/Applicationscreenshots/TSRTCHomepagescreenshot1.png"));
		
		/*
		// identify the headerblock
		// class="menu_wrap
		  By  TSRTC_HeaderBlockLocator=By.className("menu_wrap");
		 WebElement  HeaderBlock= driver.findElement(TSRTC_HeaderBlockLocator);
		 
		 //the element of the headerblock are of type link_using coomon property tagname_a
		   By HeaderBlockLocator=By.tagName("a");
		   
		   // going to header block and find elements of the headerblock
		   WebElement headerblocklinks=HeaderBlock.findElement(HeaderBlockLocator);
		   
		   // finding the size of the array list
		  int  headerblocklinkscount=headerblocklinks.getSize(); 
		   
		 */
		 
		 
		 
		// driver.quit();
		 
		 

	}

}
