package com.excel;

import java.io.FileInputStream;

public class WorkBook {
	
	FileInputStream input = new FileInputStream(System.setProperty());
	XSSFWorkbook book = new XSSFWorkbook(input);
	
	//creating sheet
	XSSFSheet sheet = book.createsheet("");
	
	//craeting row
	
	XSSFRow row = sheet.createRow(4);
	
	//creating cell/column
	
	XSSFCell cell = sheet.getRow(4).createCell(4);
	
	
	//Calling Workbook
	
	XSSFSheet sheet1 = book.getSheet();
	
	XSSFRow row1 = sheet1.getRow(2);
	
	XSSFCell cell1 = sheet1.getRow(2).getCell(1)
	
	
	FileOutputStream output = new FileOutputStream(System.setProperty());		

}
