package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class OHRMScreenShot
{
	
	public static void takesScreenshot(WebDriver driver,String imageName) throws IOException
	{
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File errorScreenShot =takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(errorScreenShot,new File("./OrangeHRMApplication ErrorScreenshots/"+imageName+".png"));
	}
 
}
