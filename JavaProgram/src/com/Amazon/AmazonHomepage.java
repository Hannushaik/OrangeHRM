package com.Amazon;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomepage {

	private static final String Hello = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String applicationUrlAddress="http://amazon.com";
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		
		
		// Maximize the broeser
		
		driver.manage().window().maximize();
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Hello signin element property
		
		//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		//id="nav-link-accountList
		 By HelloSignInL=By.id("nav-link-accountList");
		 WebElement SignIn1=driver.findElement(HelloSignInL);
		 
		 
		 
		
		
		// Actions class to perform MouseHovr Operations onto HelloSignIn Element
		 
		 Actions action=new Actions(driver);
		 
		action.moveToElement(SignIn1).build().perform();	
		
		
		// Yor wish list element under test
		
		//<span class="nav-text">Watchlist</span>
		
		// class="nav-text"
		
		
		   By watchList=By.className("nav-text");
		   WebDriverWait wait=new WebDriverWait(driver,20);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(watchList));
		   WebElement MyWatchlist=driver.findElement(watchList);

		// screenshot)
		  Thread.sleep(1000);
		  
		  File AmazonHomepagescreenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  FileUtils.copyFile(AmazonHomepagescreenshot,new File("./Applicationscreenshots/AmazonHomepagescreenshot1.png"));
		  
		  driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
