package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCommonMethod
{
	String excelfileInputPath;
	String excelfileOutputPath;
	String sheetName;
	XSSFWorkbook workBook;
	
	
	public ExcelCommonMethod(String excelFileInputPath,String excelOutputPath,String  sheetName) throws IOException
	{
		
		this.excelfileInputPath=excelFileInputPath;
		this.excelfileOutputPath=excelfileOutputPath;
		this.sheetName=sheetName;
		FileInputStream file=new FileInputStream(excelfileInputPath);
		 workBook=new XSSFWorkbook(file);
	}
	
	public String getCellValue(int rowIndex,int cellIndex)
	{
		XSSFSheet sheet=workBook.getSheet(sheetName);
	    Row	row=sheet.getRow(rowIndex);
	    Cell  rowOfCell=row.getCell(cellIndex);
	    
	    return rowOfCell.getStringCellValue();
	}
	
	public String SetCellValue(int rowIndex, int cellIndex,String data) throws IOException
	{
		XSSFSheet sheet=workBook.getSheet(sheetName);
	    Row row=sheet.getRow(rowIndex);		
	 	Cell rowOfCell=row.createCell(cellIndex);
	 	
	 	 rowOfCell.setCellValue(data);
	 	 FileOutputStream outputStreamTestResultFile=new FileOutputStream(excelfileInputPath);
	 	 workBook.write(outputStreamTestResultFile);
		return data;
		
	}
	
	
	

}
