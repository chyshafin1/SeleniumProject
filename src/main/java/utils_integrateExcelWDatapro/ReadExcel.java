package utils_integrateExcelWDatapro;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

//	public static String[][] main(String[] args) throws IOException {
		public String [][] readExcel()throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data4/readExcel.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int coloumnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(coloumnCount);
		
		String [][] data = new String [rowCount][coloumnCount];
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < coloumnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data [i-1][j]=value;
			
			}
		}
		return data;
	
		
		}

}
