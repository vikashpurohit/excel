package readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\ExcelData\\userData.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);//load complete workbook use HSSFWorkbook for xls file
		
		XSSFSheet sheet = workbook.getSheetAt(0);

		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();

		System.out.println("Data from Excel is " + data0);

		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();

		System.out.println("Data from Excel is " + data1);

		workbook.close();
	}

}
