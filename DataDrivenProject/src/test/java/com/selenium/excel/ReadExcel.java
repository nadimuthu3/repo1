package com.selenium.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		
		
		
		try {
			
			FileInputStream istream = new FileInputStream("C:\\Users\\njayapal\\testCaseData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(istream);
			XSSFSheet sheet = workbook.getSheet("CreateCustomer");
			
			int noOfRows = sheet.getLastRowNum();
			System.out.println("the number of rows "+noOfRows);
			
			for(int i=0;i<=noOfRows;i++){
				XSSFRow row = sheet.getRow(i);
				int noOfColumns = row.getLastCellNum();
				System.out.println("number of columns "+noOfColumns);
				
				
				for(int j=0;j<noOfColumns;j++){

					XSSFCell cell = row.getCell(j);
					String celldata = cell.getStringCellValue();
					
					System.out.println("data is "+celldata);

				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
