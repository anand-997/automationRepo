package Exel_Handle;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Prac {
	
	public static void main(String[] args) throws InvalidFormatException, IOException  {
		
		File file = new File("C:\\Users\\aq1\\Desktop\\ST\\TestP.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//XSSFSheet sh = workbook.createSheet();
		XSSFSheet sh = workbook.createSheet("First Sheet");
		sh.createRow(0).createCell(0).setCellValue("Age");
		
		
		
		
	}

	
}
