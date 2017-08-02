package frameworks;

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

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath, String SheetName)
			throws Exception {

		String[][] tabArray = null;

		try {
			FileInputStream ExcelFile = new FileInputStream(FilePath);

			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int startRow = 0;
			int startCol = 1;
			int ci, cj;

			int totalRows = ExcelWSheet.getLastRowNum();
			System.out.println("total number of rows "+totalRows);

			// you can write a function as well to get Column count

			int totalCols = 3;

			tabArray = new String[totalRows+1][totalCols];
			ci = 0;
			for (int i = startRow; i <= totalRows; i++, ci++) {
				cj = 0;
				for (int j = startCol; j <= totalCols; j++, cj++) {
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

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			int dataType = Cell.getCellType();

			if (dataType == 3) {

				return "";

			} else {

				String CellData = Cell.getStringCellValue();

				return CellData;

			}
		} catch (Exception e) {

			System.out.println(e.getMessage());

			throw (e);

		}

	}
	
	public static void readAllDataExcel(String fileName) throws InvalidFormatException, IOException{
		
		FileInputStream fis = new FileInputStream(fileName);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		wb.getNumberOfSheets();
//		wb.getSheetAt(index)
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getLastRowNum();
		System.out.println("number of rows is "+noOfRows);
		System.out.println("Data were ");
		for(int i=0;i<=noOfRows;i++) {
			int noOfColumns = sheet.getRow(i).getLastCellNum();
			XSSFRow currentRow = sheet.getRow(i);
			for(int j=0;j<=noOfColumns;j++){
				XSSFCell currentCell = currentRow.getCell(j);
				if(currentCell!=null)
					System.out.println(currentCell.getStringCellValue());	
			}
		}
		
	}	

}