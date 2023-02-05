package com.WebTable1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CapturingCompleteWebTableData1 extends BaseTest
{
	
	 public void getCompleteWebTableData() throws IOException
	 {
		 FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\src\\com\\ExcelOperation\\Excel_Write_SingTestData.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 XSSFSheet sheet =workbook.getSheet("sheet2");
		
		 
		 
		 
		 // first row of first columnn  
		 // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		 
		 // last row of last column
		 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		 
		 // to go all the row of web table
		 
		 for(int index=1;index<=36;index++)
		 {
			  Row   row=sheet.createRow(index);
			  
			 for(int rowOfCell=1; rowOfCell<=8; rowOfCell++)
			 {
				 
			 
			     By  WebTableL= By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td["+rowOfCell+"]");
			     WebElement   WebTable= driver.findElement(WebTableL);
			     
			     //create a row
				    
				   // Row   row=sheet.createRow(index);
				    // create a row of cell
				  Cell   RowOfCell=row.createCell(rowOfCell);
		
			     
			     
			     String WebTableData=WebTable.getText();
			     System.out.print( WebTableData);  
			     
			   RowOfCell.setCellValue( WebTableData);     
		    FileOutputStream file1=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\src\\com\\ExcelOperation\\Excel_Write_SingTestData.xlsx");
		    workbook.write(file1);
							    
			     
			     
			 }
			 System.out.println();
		 }
		 }
		 public static void main(String[] args) throws IOException
		 {
			 CapturingCompleteWebTableData1 getData=new CapturingCompleteWebTableData1();
			 getData.applicationLaunch();
			 getData.getCompleteWebTableData();
			 getData.applicationclose();
			 
		 }
		 
          
		 
		 
	  
		 
		 
		 
	 }
	


