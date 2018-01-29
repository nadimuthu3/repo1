package com.opentaps.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewexcelUtil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//"C:\\Users\\njayapal\\testCaseData1.xlsx
		
		NewexcelUtil read = new NewexcelUtil();
		read.readExcel("C:\\Users\\njayapal\\testCaseData1.xlsx", "Sheet1");

	}
	
	public void readExcel(String filepath, String sheetName) throws IOException
	{
		FileInputStream istream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(istream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		System.out.println("no of rows" + sheet.getLastRowNum());
		for(int i = 0;i<=sheet.getLastRowNum();i++){
			XSSFRow row = sheet.getRow(i);
			System.out.println("no of columns" + row.getLastCellNum());
			for(int j = 0;j<row.getLastCellNum();j++){
				XSSFCell cell =  row.getCell(j);
				System.out.println("cell type" + cell.getCellType());
				if(cell.getCellType()== 1){
					System.out.println(cell.getStringCellValue());
				}
				else if(cell.getCellType()==0){
					System.out.println(cell.getNumericCellValue());
				}
				
				
			}
		}
		
		
	}
}
