package readExcel;

import lib.ReadExcelConfig;

public class ReadExcelConfigData {

	public static void main(String[] args) {

		ReadExcelConfig excelConfig = new ReadExcelConfig("C:\\ExcelData\\userData.xlsx");

		System.out.println(excelConfig.getData(0, 0, 0));
	}

}
