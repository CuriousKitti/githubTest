package sdet_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\windows gallery\\Desktop\\Accounts.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheet("Rakuten");

		int rowCount = st.getLastRowNum();
		int colCount = st.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) 
		{

			XSSFRow currentRow = st.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				String value = currentRow.getCell(j).toString();
				System.out.print(value+"     ");
			}
			System.out.println();
		}
		wb.close();
	}

}
