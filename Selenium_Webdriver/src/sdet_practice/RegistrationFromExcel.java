package sdet_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFromExcel {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D://Testing//Eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");		
		driver.manage().window().maximize();
		
		//Getting data from excel
		
		FileInputStream file = new FileInputStream("D:\\Testing\\Assignments\\Registration.xlsx	");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getLastRowNum();
		
		for(int i=1;i<=noOfRows;i++)
		{
			
			XSSFRow currentRow =sheet.getRow(i);
			
			String First_Name =currentRow.getCell(0).getStringCellValue();
			String Last_Name =currentRow.getCell(1).getStringCellValue();
			String Phone =currentRow.getCell(2).getStringCellValue();
			String Email =currentRow.getCell(3).getStringCellValue();
			String Address =currentRow.getCell(4).getStringCellValue();
			String City=currentRow.getCell(5).getStringCellValue();
			String State =currentRow.getCell(6).getStringCellValue();
			String Postal_Code =currentRow.getCell(7).getStringCellValue();
			String Country =currentRow.getCell(8).getStringCellValue();
			String Username =currentRow.getCell(9).getStringCellValue();
			String Password =currentRow.getCell(10).getStringCellValue();
			
			//Registration process
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Entering Contact Information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//Entering Mailing Information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(Postal_Code);
			
			//Country Selection
			Select country = new Select(driver.findElement(By.name("country")));
			country.selectByVisibleText(Country);
			
			//Entering User Information
			driver.findElement(By.name("email")).sendKeys(Username);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//Submitting the Form
			driver.findElement(By.name("submit")).click();
			
			//Validation
			if(driver.getPageSource().contains("Thank you for registering"))
			{
				System.out.println("Registration is completed for "+ i +" record");
			}
			else
			{
				System.out.println("Registration failed for "+ i + " record");
			}
			
		}
		
		System.out.println("Test Completed");
		driver.quit();
		wb.close();
	}

}
