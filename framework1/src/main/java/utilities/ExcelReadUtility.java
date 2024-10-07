package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
	static FileInputStream f; // Interface for file input
	static XSSFWorkbook w;
	static XSSFSheet sh;

	// Method to read string data from Excel
	public static String readStringData(int a, int b) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//TestData.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}

	// Method to read integer data from Excel
	public static String readIntegerData(int a, int b) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//TestData.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int val = (int) c.getNumericCellValue();
		return String.valueOf(val);
	}
}
