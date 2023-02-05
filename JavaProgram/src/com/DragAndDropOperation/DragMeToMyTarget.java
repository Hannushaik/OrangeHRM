package com.DragAndDropOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMeToMyTarget {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String appicationUrlAddress="https://jqueryui.com/droppable/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appicationUrlAddress);
		
		// maximize
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// properties of the frame
		
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		// class="demo-frame"
		
		  By FrameLocator=By.className("demo-frame");
		  WebElement webpageFrame=driver.findElement(FrameLocator);
		  
		 // Switching in to frame of the webpage
		  driver.switchTo().frame(webpageFrame);
		  
		  // drag me to my target
		  // id="draggable"
		  
		    By dragToMyTargetLocator=By.id("draggable");
		    WebElement dragToMyTarget=driver.findElement(dragToMyTargetLocator);
		    String dragToMyTargetText=dragToMyTarget.getText();
		    System.out.println(" the text of the element is:"+ dragToMyTargetText);
		    
		    // properties of DropHere
		    // <div id="droppable" class="ui-widget-header ui-droppable">
			
		     By DropHereLocator=By.id("droppable");
		     WebElement  DropHere=driver.findElement(DropHereLocator);
		     
		     // mouse operation- done using Actions class
		     Actions action=new Actions(driver);
		     // performing drag and drop operations using actions class
		     action.dragAndDrop(dragToMyTarget, DropHere).build().perform();
		     
		     // switching back to driver of the actual page
		     // default content()- method is used to go bact to webpage
		     
		     driver.switchTo().defaultContent();
		     // automatig Resizable element
		     
		     //<a href="http://jqueryui.com/resizable/">Resizable</a>
		     
		     By  ResizableL=By.linkText("Resizable");
		       WebElement resizable= driver.findElement(ResizableL);
		       resizable.click();
		       
		       System.out.println(driver.getTitle());
				    
		    
		    
		
		    driver.quit();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
