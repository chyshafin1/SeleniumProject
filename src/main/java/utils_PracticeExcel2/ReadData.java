package utils_PracticeExcel2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] readdata() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data5/readdata.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		short coloumnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(coloumnCount);
		
		String [][] data = new String[rowCount][coloumnCount];
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < coloumnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String CellValue = cell.getStringCellValue();
				//System.out.println(stringCellValue);
				data [i-1][j]= CellValue ;
			}
		}
		
		return data;
	}

}
