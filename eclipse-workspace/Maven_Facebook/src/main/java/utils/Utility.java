package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot (WebDriver driver, int testID) throws IOException {
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH mm ss") ;
		LocalDateTime now = LocalDateTime.now() ;
		String dateTime = dateTimeFormat.format(now);
		File Copyss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		File Pastss = new File ("C:\\Users\\aq1\\Pictures\\Screenshots\\"
				+ "Test-"+""+testID+" "+dateTime+".jpg") ;
		FileHandler.copy(Copyss, Pastss) ;
	}
	
	public static String getExcelSheet (String sheetName, int row, int cell) throws  IOException {
		String path = "D:\\Software Testing files\\Apache prac.xlsx" ;
		FileInputStream file = new FileInputStream(path) ;
		Cell data = WorkbookFactory
					.create(file)
					.getSheet(sheetName)
					.getRow(row)
					.getCell(cell) ;
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
}
