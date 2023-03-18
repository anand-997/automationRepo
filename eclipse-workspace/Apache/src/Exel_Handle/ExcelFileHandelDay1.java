package Exel_Handle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileHandelDay1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		
		String path = "D:\\Software Testing files\\Apache prac.xlsx";
//		FileInputStream file = new FileInputStream(path);
//		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
//		System.out.println(data);
		
//		String path1 = "C:\\Users\\aq1\\Desktop\\ST\\Apache prac.xlsx";
//		FileInputStream file1 = new FileInputStream(path);
//		Date date = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(6).getCell(1).getDateCellValue();
//		System.out.println(date); // date
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		// chgain break
//		Workbook Data = WorkbookFactory.create(file);
//		Sheet st1 = Data.getSheet("Sheet1");
//		Row fr = st1.getRow(1);
//		Cell cl = fr.getCell(0);
//		String data = cl.getStringCellValue();
				
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		int i,j;
//				
//		for ( i = 0 ; i <= 4 ; i++ )
//		{
//			for ( j = 0 ; j < 1 ; j++ )
//			{
//				FileInputStream file = new FileInputStream(path);
//				String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//				System.out.print(data + ", ");
//			}
//			for (int k = 1; k <= 1; k++)
//			{	
//				FileInputStream file = new FileInputStream(path);
//				String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
//				System.out.print(data);
//			}
//			System.out.println();
//		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		String path = "D:\\Software Testing files\\Apache prac.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		Row s = sheet.getRow(0);
		
		for (int i = 0; i < row; i++)
		{
			int colum = s.getLastCellNum();
			for (int j = 0; j < colum; j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + ", ");
			}
			System.out.println();
		}
	}

}
