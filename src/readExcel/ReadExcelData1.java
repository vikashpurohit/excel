package readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData1 {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\ExcelData\\userData.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);// load complete workbook use HSSFWorkbook for xls
																	// file

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();

		System.out.println("Total Row is " + (rowCount + 1));

		for (int i = 0; i < rowCount; i++) {

			String data0 = sheet.getRow(i).getCell(0).getStringCellValue();

			System.out.println("Data From " + i + " is " + data0);
		}
		workbook.close();
	}

}
