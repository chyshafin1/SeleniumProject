package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class connectionWithExcel {

	public static void main(String[] args) throws IOException  {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/Readdata.xlsx");
		
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//Get Row
		XSSFRow row = sheet.getRow(3);
		
		//Get Column
		XSSFCell cell = row.getCell(1);
		
		//Action -Read /print
		 double cellValue = cell.getNumericCellValue(); 
		System.out.println(cellValue); 
		
		/* XSSFSheet sheet = wb.getSheet("Sheet1");
		 XSSFRow row = sheet.getRow(2);
		 XSSFCell cell = row.getCell(0);
		 System.out.println(cell);*/
		
		
	
	}

}
