package Exel_Handle;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {
	
	// program for create new and update excel file
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EMP");
		
		//STORE DATA IN 2-ARRAY
		Object emp_data [] [] = {{"EMP ID", "EMP NAME", "DESIGNATION"},
								 {"101", "ANIKET","MANAGER"},
								 {"102", "ANKIT","DEVELOPER"},
								 {"103", "PALLAVI","TESTER"},
								 {"104", "anand","BA"}};
		
		//CHECK NO AND COL OF DATA
		int rows=emp_data.length;
		int cols=emp_data[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		//entering data
		for(int r=0; r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell= row.createCell(c);
				Object value = emp_data[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
			}
		}
		//String filepath = "C:\\Users\\aq1\\Desktop\\apache.xlsx";
		FileOutputStream out= new FileOutputStream ("C:\\Users\\aq1\\Desktop\\apache.xlsx");
		workbook.write(out);
		out.close();
		System.out.println("success");
	}

}
