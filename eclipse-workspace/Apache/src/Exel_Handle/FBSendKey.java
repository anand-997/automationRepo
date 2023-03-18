package Exel_Handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSendKey {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		String path = "C:\\Users\\aq1\\Desktop\\ST\\Apache prac.xlsx";
		FileInputStream file = new FileInputStream(path);
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
		System.out.println(data);

		String path1 = "C:\\Users\\aq1\\Desktop\\ST\\Apache prac.xlsx";
		FileInputStream file1 = new FileInputStream(path);
		String data3 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(9).getCell(2).getStringCellValue();
		System.out.println(data3);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aq1\\Downloads\\java software\\selenium_chromedriver\\app\\crome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys(data);
		Thread.sleep(1000);
		WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
		Pass.sendKeys(data3);
		System.out.println("end");
		}

}
