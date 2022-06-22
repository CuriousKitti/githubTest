package sdet_practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkBookFactoryTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Workbook wb = WorkbookFactory.create(new File("D:\\Testing\\Assignments\\Registration.xlsx"));
		Sheet s = wb.getSheet("Test");
		int rowCount = s.getPhysicalNumberOfRows();

		for (int i = 1; i < rowCount; i++) {

			Row row = s.getRow(i);
			int colCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < colCount; j++) {

				String col1 = row.getCell(j).getStringCellValue();
				System.out.print(col1+"   ");
			}
			System.out.println();
		}

	}

}
