package automationClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelType1 {

	public void readExcel(String sampleFile) throws IOException
	{
		String fileType = sampleFile.substring(sampleFile.indexOf("."));
		FileInputStream file = new FileInputStream(sampleFile);
		
		//Condition to identify file type
		Workbook excel =null;
		if(fileType.equals(".xlsx"))
		{
			excel = new XSSFWorkbook(file);
		}
		else if(fileType.equals(".xls"))
		{
			excel = new HSSFWorkbook(file);
		}
		
		//Get sheet of chosen file type
		Sheet st = excel.getSheet("Sheet1");
		int row = st.getLastRowNum();
		int col = st.getRow(1).getLastCellNum();
		
		for(int i=1;i<=row;i++)
		{
			Row curRow = st.getRow(i);
			for(int j=1;j<=col;j++)
			{
				
				System.out.println(curRow.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ReadFromExcelType1 myObj = new ReadFromExcelType1();
		myObj.readExcel("D:\\Testing\\Assignments\\ReadFromExcel.xlsx");
		
	}
	
}