package com.juneproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		ReadExcelData data = new ReadExcelData();
		data.method1();
	}
	public void method1() throws IOException{
		
		File file = new File("C:\\Users\\njayapal\\testCaseData.xlsx");
		FileInputStream istream = new FileInputStream(file);
		
		
		XSSFWorkbook workbook  = new XSSFWorkbook(istream);
		XSSFSheet sheet = workbook.getSheet("CreateCustomer");
		
		System.out.println("the number of rows "+sheet.getLastRowNum());
		for (int j = 0; j <= sheet.getLastRowNum();j++) {
			XSSFRow row = sheet.getRow(j);
			System.out.println("no of active cells " + row.getLastCellNum());
			for (int i = 0; i < row.getLastCellNum(); i++) {
				XSSFCell cell = row.getCell(i);
				int code = cell.getCellType();
				System.out.println("the code is " + code);
				String str = null;
				//get the cell type and call the respective methods 
				if (code == 1) {
					str = cell.getStringCellValue();
				} else if (code == 0) {
					int dble = (int) cell.getNumericCellValue();
					str = String.valueOf(dble);
				}
				System.out.println("the data is " + str);
			}
		}
	}
	
	
}
