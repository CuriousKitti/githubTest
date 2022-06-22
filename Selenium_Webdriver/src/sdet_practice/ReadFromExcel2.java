package sdet_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("D:\\Testing\\Assignments\\Registration.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value = currentrow.getCell(j).toString();
				System.out.print(value+"    ");
			}
			System.out.println();
		}
		
		wb.close();
	}
	

}
