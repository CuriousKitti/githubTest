package sdet_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBI_InterestCalculator {

	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");

		FileInputStream file = new FileInputStream("D:\\Testing\\Assignments\\InterestCalculator.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		for(int i=1; i<=rowcount;i++)
		{
			
			XSSFRow row = sheet.getRow(i);
			int princi = (int)row.getCell(0).getNumericCellValue();
			int ROI = (int) row.getCell(1).getNumericCellValue();
			int period = (int) row.getCell(2).getNumericCellValue();
			String freq = row.getCell(3).getStringCellValue();
			double MatValue = row.getCell(4).getNumericCellValue();
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princi));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(ROI));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));
			
			
			//Select drop down 2 ways
			
			/*WebElement yr = driver.findElement(By.id("tenurePeriod"));
			Select year = new Select(yr);
			year.selectByVisibleText("year(s)");*/
			
			Select year = new Select(driver.findElement(By.id("tenurePeriod")));
			year.selectByVisibleText("year(s)");
			
			
			/*Select IntType = new Select(driver.findElement(By.id("frequency")));
			IntType.selectByVisibleText(freq);*/
			
			
			WebElement IT= driver.findElement(By.id("frequency"));
			Select IntType =  new Select(IT);
			IntType.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//*[@id=\'fdMatVal\']/div[2]/a[1]/img")).click();//Click on calculate button
			
			String ActValue = driver.findElement(By.xpath("//*[@id=\'resp_matval\']/strong")).getText();
			
			if(Double.parseDouble(ActValue)==MatValue)
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			
			driver.findElement(By.xpath("//*[@id=\'fdMatVal\']/div[2]/a[2]/img")).click();
	
		}
		
		wb.close();
		driver.quit();
	
	}

}
