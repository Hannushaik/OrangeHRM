package com.ExcelReadOperation_Multiple_Test_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData

{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\Eclipse1\\JavaProgram\\src\\com\\ExcelRead_MultipleTextData\\ExcelReadMultipleTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("sheet1");
		// Identify the no.of active Rows in the sheet
		
        int	rowsCount=sheet.getLastRowNum();
        
        // should goto every active row
        
        for( int rowIndex=0; rowIndex<=rowsCount; rowIndex++)
        {
        	//going to an Active Row
        	
        	   Row row=sheet.getRow(rowIndex);
        	   
        	   // Going to active Row  and finding no of active cells
        	   
        	 int  CellCount=row.getLastCellNum();
        	 
        	 // going to active row of all active row cells
        	 for(int rowOfCellIndex=0; rowOfCellIndex<=CellCount; rowOfCellIndex++)
        	 {
        		 Cell rowOfCell=row.getCell(rowOfCellIndex);
        		 // get the data from row of a cell
        		 
        		 String data=rowOfCell.getStringCellValue();
        		 
        		 System.out.println(data);
        		 
        	 }
        	 
        	
        	
        	
        	
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
