package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingFirstColumnOfAllRowsData
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


	
	 public void FirstColumnData() throws IOException
	 {
		 FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\src\\com\\ExcelOperation\\Excel_Write_SingTestData.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 XSSFSheet sheet =workbook.getSheet("sheet5");
		 
		 
		  
		 // first row of first column
		 // locator-x path
		 // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		 
		 // last row of first column
		 // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		 
		 // go to all rows of first column
		 for(int index=1; index<=36; index++)
		 {
			 By  XpathExpressionL= By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
			    WebElement   cityName=driver.findElement(XpathExpressionL);
			    
			    //create a row
			    
			   Row   row=sheet.createRow(index);
			    // create a row of cell
			    Cell   rowOfCell=row.createCell(0);
			    
			    String CityNameText=cityName.getText();
			    System.out.println( CityNameText);
			    
			    
			    
			   rowOfCell.setCellValue( CityNameText);     
             FileOutputStream file1=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\src\\com\\ExcelOperation\\Excel_Write_SingTestData.xlsx");
		    workbook.write(file1);
			    
			    
			    
		 }
	 }
	 public static void main(String[] args) throws IOException
	 {
		 CapturingFirstColumnOfAllRowsData getData=new  CapturingFirstColumnOfAllRowsData();
		 getData.applicationLaunch();
		 getData.FirstColumnData();
		 getData.applicationclose();
		
	}
		 
		
			 
			 
			
			 
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]
	

}
