package com.OrangeHrm;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class OrangeHRM_AdminHomepage
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	 FileInputStream file=new FileInputStream("./src/com/ExcelOperation/UserNamePassword.xlsx");
	 XSSFWorkbook workbook=new XSSFWorkbook();
	 XSSFSheet sheet=workbook.getSheet("sheet1");
	 Row  row=sheet.getRow(1);
	 Cell  rowOfCell=row.getCell(0);
		
		
		
	String applicationUrlAddress=" http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\DriverFiles\\chromedriver.exe");
		
		
		driver =new ChromeDriver();
		
		
		driver.get(applicationUrlAddress);
		
		//validate OrnageHRM Title
		
		String expected_OrangeHRMTitle="OrangeHRM";
		System.out.println(" expected Orange hrm title is:"+ expected_OrangeHRMTitle);
		
		
		String actual_OrangeHRMTitle=driver.getTitle()	;	
		System.out.println(" current OrnageHRM title is:"+ actual_OrangeHRMTitle);
		
		// validate OrangeHRMUrlAddress
		
		
		String expected_OrangeHRMUrlAddress="orangehrm";
		System.out.println(" OrangeHRM url address is:"+  expected_OrangeHRMUrlAddress );
		
		String actual_OrangeHRMUrlAddress=driver.getCurrentUrl();
		System.out.println(" current OrangeHRM is:"+actual_OrangeHRMUrlAddress);
		
		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println(" Title is not same");
		}
		
		
		
		if(actual_OrangeHRMUrlAddress.contains(expected_OrangeHRMUrlAddress))
		{
			System.out.println("OrangeHRM url address is same");
		}
		else
		{
			System.out.println("OrangeHRM url address not same");
		}
		
	   
	 
		 // <input name="txtUsername" id="txtUsername" type="text">
		 
		    String UsernameTestdata="Hannusk";
		    By UserNameL=By.id("txtUsername");
		    WebElement UserName= driver.findElement(UserNameL);
            UserName.sendKeys(UsernameTestdata);
            System.out.println(" usename element login success");
            sheet.getRow(1).createCell(0).setCellValue(UsernameTestdata);
          
            
		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
            
            String passwordTestData="Hannu012001@";
            By Passwordl= By.name("txtPassword");
            WebElement Password=driver.findElement(Passwordl);
            Password.sendKeys(passwordTestData);
            System.out.println(" password element login success");
           sheet.getRow(1).createCell(1).setCellValue(passwordTestData); 
            
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		
		  By LoginL1=By.className("button");
		  WebElement  Loginn=driver.findElement(LoginL1);
		  Loginn.click();
		  System.out.println(" login button functionality executed success");
		  
		  
		  
		  String expectedText="Admin";
		  System.out.println("expexted Text of Admin:"+expectedText);
		  
		  
		  By  adminLocator=By.id("menu_admin_viewAdminModule");
		  WebElement admin= driver.findElement(adminLocator);
		 // admin.click();
		  /*
	    	String  actualText=admin.getText();
	    	System.out.println(actualText);
	    	
	    	if(actualText.equals(expectedText))
	    	{
	    		System.out.println("passed");
	    		row.createCell(2).setCellValue("Pass");
	    		
	    	}
	    	else
	    	{
	    		System.out.println(" failed");
	    		row.createCell(2).setCellValue("false");
	    	}
	    
		  */
		  
		  sheet.getRow(1).createCell(2).setCellValue("pass");
            		  
		  
    
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		// locator=linkTest
		  
		   By WelcomeAdminL=By.id("welcome");
	     WebElement WelcomeAdmin=driver.findElement(WelcomeAdminL);
	     WelcomeAdmin.click();
		
	     // mouse hover operations
		
	     Actions action=new Actions(driver);
	    action.moveToElement(WelcomeAdmin).build().perform();
		
	     
	     Thread.sleep(3000);
	     By LogoutL=By.linkText("Logout");
	      WebElement  Logout=driver.findElement(LogoutL);
		  Logout.click();  
           
	        String	OrangeH = WelcomeAdmin.getText();
	        
	      			   
	 
	     FileOutputStream file1 =new FileOutputStream("./src/com/ExcelOperation/UserNamePassword.xlsx");
	     workbook.write(file1);
	
		String value=rowOfCell.getStringCellValue();
		System.out.println(value);
	//	System.out.println(driver.getTitle());
		
		
		//File  OrangeHrmScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
	       
		  //FileUtils.copyFile(OrangeHrmScreenShot, new File("./ApplicationScreenShots/hrmscreenshot.png"));
		
		
		driver.quit();
		

	
		
		
	
		
		
		
		

	}

}
