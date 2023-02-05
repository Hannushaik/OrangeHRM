package com.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

public class Capturing_BingHompageScreenShot
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		
		String appcationUrlAddress="http://bing.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appcationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		  File  bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
	       
		  FileUtils.copyFile(bingScreenShot, new File("./ApplicationScreenShots/bingHomepage1.png"));
		//  FileUtils.copyFile(bingScreeShot,new File(/Applicationscreenshots/bingHomepage1.png"));
		

	
	    driver.quit();
	
	}
}
