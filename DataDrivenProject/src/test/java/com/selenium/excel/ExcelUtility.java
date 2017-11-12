package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static void main(String[] args) {
		
			
			
			
			
		ExcelUtility util = new ExcelUtility();
		util.readExcelData();
		
		
		

	}
	public  static String[][] readExcelData() {
		String array1[][] = null;
		try {
			File file = new  File("C:\\Users\\njayapal\\testCaseData.xlsx");
			FileInputStream istream = new FileInputStream(file);
			
			
			XSSFWorkbook workbook = new XSSFWorkbook(istream);
			XSSFSheet sheet = workbook.getSheet("CreateCustomer");
			int noOfRows = sheet.getLastRowNum();
			System.out.println("no of rows "+noOfRows);
			int noOfColumns = sheet.getRow(0).getLastCellNum();
			System.out.println("no of columns"+noOfColumns);
			
			array1 = new String[noOfRows+1][noOfColumns];
			for(int j=0;j<=noOfRows;j++){
				XSSFRow row = sheet.getRow(j);
				
				//int noOfColumns = row.getLastCellNum();
				for(int i=0;i<noOfColumns;i++){
					XSSFCell cell = row.getCell(i);
					String data = cell.getStringCellValue();
					System.out.println("data is "+ data);
					System.out.println("value of j & i "+j+" "+i);
					array1[j][i] = data;
				}
			
			
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array1;
		
		
		
		

	}
}
