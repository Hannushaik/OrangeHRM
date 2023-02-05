package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData
 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		
		// Identify the File of the system
		
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\src\\com\\ExcelOperation\\Excel Read SingleSheet.xlsx");
		
		
		// Identify the Workbook of the File
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		// Identify the sheet of the workbook
		
	   XSSFSheet   sheet=workbook.getSheet("Sheet1");
		  
		
		// Identify the Row of the sheet
	   
	                  Row  row =sheet.getRow(0);
		
		//Identify a row of a cell
	                  
	                 Cell  rowOfCell=row.getCell(0);
	                 
	                 // get the data from Row of a cell
	                 
		String data=rowOfCell.getStringCellValue();
		
		
		
		System.out.println(data);
		
		
	}

}
