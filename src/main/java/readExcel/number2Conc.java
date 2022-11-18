package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class number2Conc {

	public static void main(String[] args) throws IOException {
		 XSSFWorkbook wb = new XSSFWorkbook("./Data3/practice.xlsx");
		 XSSFSheet sheet = wb.getSheet("Sheet1");
		 
		 int rowCount = sheet.getLastRowNum();
		 System.out.println(rowCount);
		 
		 short cellCount = sheet.getRow(0).getLastCellNum();
		 System.out.println(cellCount);
		
		 for (int i = 1; i <= rowCount; i++) {
			 
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j <cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}

	}

}
