package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData
 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream("./src/com/ExcelOperation/Excel_Write_SingTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		//create a Row in a worksheet
		
		 Row row=sheet.createRow(0);
		 
		 //create rowOfCEell 
		 
		  Cell rowOfCell= row.createCell(6);
		  
		  // setting the value in the row of a cell created
		  
		  rowOfCell.setCellValue("Selenium");
		  
		  //saving the file with the workbook
		  
		  FileOutputStream file1 =new FileOutputStream("./src/com/ExcelOperation/Excel_Write_SingTestData.xlsx");
		  workbook.write(file1);
		
		
	          String value= rowOfCell.getStringCellValue();
		   System.out.println(value);
		
		
		
		
		
		

	}

}
