package Exel_Handle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Loop {
	
	public static String prac () throws IOException {
		String path = "D:\\Software Testing files\\Apache prac.xlsx";
		FileInputStream file = new FileInputStream(path);
		Cell data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0) ;
		
		try {
			String strdata = data.getStringCellValue() ;
			return strdata ;
		}
		catch (Exception e) {
			double data2 = data.getNumericCellValue() ;
			String numstrdata = Double.toString(data2) ;
			return numstrdata ;
		}
	}
	
	public static void main(String[] args) throws IOException {
		prac() ;
		
	}
}
