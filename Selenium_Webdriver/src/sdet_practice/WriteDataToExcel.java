package sdet_practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("D:\\Testing\\Assignments\\Test1.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Data");

		for (int i = 0; i < 5; i++) {

			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < 3; j++) {

				row.createCell(j).setCellValue("xyz");

			}

		}

		wb.write(file);
		wb.close();
		System.out.println("Writting data completed");

	}

}
