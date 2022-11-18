package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class number1 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data2/ReadData1.xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);

	}

}
