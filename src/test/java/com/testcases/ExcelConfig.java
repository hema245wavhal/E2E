package com.testcases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelConfig(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheet("Sheet1");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getData(String sheetnanme,int rowno,int colno)
	{
		sheet=wb.getSheet(sheetnanme);
		String data=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
		
	}
	public int getRowCount(String sheetname)
	{
		int row=wb.getSheet(sheetname).getLastRowNum();
		int rows=row+1;
		return rows;
		
	}
}
