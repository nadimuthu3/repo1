package frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	File file=null;
	FileInputStream istream;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int noOfActiveRows;
	int noofActiveCells;
	
	public static void main(String[] args) {
		ReadExcelSheet read = new ReadExcelSheet();
		read.readData();
		

	}

	
	public void readData(){
		try {
			file = new File("C:\\Users\\njayapal\\Documents\\personal\\testdata.xlsx");
			istream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(istream);
			//get sheet based on name
			sheet = workbook.getSheet("Sheet1");
			noOfActiveRows=sheet.getLastRowNum();
			System.out.println("no of rows "+noOfActiveRows);
			for (int i = 0; i <= noOfActiveRows; i++) {
				//get row based on index
				row = sheet.getRow(i);
				noofActiveCells=row.getLastCellNum();
				System.out.println("no of cells "+noofActiveCells);
				for (int j = 0; j < noofActiveCells; j++) {
					cell = row.getCell(j);
					//fetch data from cell
					String data = cell.getStringCellValue();
					System.out.println("the data " + data);
				}
			}
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
