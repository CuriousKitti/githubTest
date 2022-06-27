package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class testData {

	@Test
	public static ArrayList<Object[]> readFromExcel() throws EncryptedDocumentException, IOException {
		
		ArrayList<Object[]> testData = new ArrayList<Object[]>();
		
		String filepath ="C:\\Users\\windows gallery\\eclipse-workspace\\DollerDays\\src\\test\\java\\data\\DollarDaysTestdata.xlsx";
		Workbook wb = WorkbookFactory.create(new File(filepath));
		Sheet st = wb.getSheet("Sheet1");
		int rowCount = st.getPhysicalNumberOfRows();
		
		for(int i=1;i<rowCount;i++) {
			
			Row row = st.getRow(i);
			String userName= row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();
				
			Object[] obj = {userName,password};
			testData.add(obj);
		}
		return testData;
	}
	
}
