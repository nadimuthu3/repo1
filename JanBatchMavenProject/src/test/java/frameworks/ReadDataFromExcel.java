package frameworks;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		try {
			ExcelUtils.readAllDataExcel("C:\\Users\\njayapal\\Documents\\personal\\testdata.xlsx");
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

}
