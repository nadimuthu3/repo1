package com.juneproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet sheet;

	private static XSSFWorkbook workbook;

	private static XSSFCell cell;

	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

		String[][] tabArray = null;
		try {
			
			FileInputStream ExcelFile = new FileInputStream(FilePath);

			// Access the required test data sheet
			workbook = new XSSFWorkbook(ExcelFile);
			sheet = workbook.getSheet(SheetName);
			int startRow = 0;
			int startCol = 0;
			int ci, cj;

			int totalRows = sheet.getLastRowNum();
			System.out.println("total number of rows " + totalRows);

			// you can write a function as well to get Column count
			System.out.println("total columns "+sheet.getRow(0).getLastCellNum());
			int totalCols = sheet.getRow(0).getLastCellNum();

			tabArray = new String[totalRows + 1][totalCols];
			ci = 0;
			for (int i = startRow; i <=totalRows; i++, ci++) {
				//System.out.println("value of i "+i);
				cj = 0;
				for (int j = startCol; j < totalCols; j++, cj++) {
					//System.out.println("value of j "+j);
					tabArray[ci][cj] = getCellData(i, j);
					System.out.println(tabArray[ci][cj]);
					
				}

			}

		}

		catch (FileNotFoundException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return (tabArray);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			cell = sheet.getRow(RowNum).getCell(ColNum);

			int dataType = cell.getCellType();
			//System.out.println("type code is "+dataType);
			String CellData = null;
			if (dataType == 0) {
				int dble = (int) cell.getNumericCellValue();
				CellData = String.valueOf(dble);
				//return CellData;

			} else if(dataType==1) {

				CellData = cell.getStringCellValue();

				//return CellData;

			}
			
			return CellData;
		} catch (Exception e) {

			System.out.println(e.getMessage());

			throw (e);

		}

	}

	public static void readAllDataExcel(String fileName, String sheetName)
			throws InvalidFormatException, IOException {

		FileInputStream fis = new FileInputStream(fileName);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// wb.getNumberOfSheets();
		// wb.getSheetAt(index)

		XSSFSheet sheet = wb.getSheet(sheetName);
		int noOfRows = sheet.getLastRowNum();
		System.out.println("number of rows is " + noOfRows);
		System.out.println("Data were ");
		for (int i = 0; i <= noOfRows; i++) {
			int noOfColumns = sheet.getRow(i).getLastCellNum();
			XSSFRow currentRow = sheet.getRow(i);
			for (int j = 0; j <= noOfColumns; j++) {
				XSSFCell currentCell = currentRow.getCell(j);
				if (currentCell != null)
					System.out.println(currentCell.getStringCellValue());
			}
		}

	}

}
