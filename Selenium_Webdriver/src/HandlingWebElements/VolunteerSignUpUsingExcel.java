package HandlingWebElements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VolunteerSignUpUsingExcel {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

		FileInputStream file = new FileInputStream("D:\\Testing\\Assignments\\VolunteerSignUp.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();

		// for(int i=1; i<=row; i++)
		// {

		XSSFRow curRow = sheet.getRow(1);

		// Getting value from each row
		String firstName = curRow.getCell(0).toString();
		String lastName = curRow.getCell(1).toString();
		String phone = curRow.getCell(2).toString();
		String country = curRow.getCell(3).toString();
		String city = curRow.getCell(4).toString();
		String email = curRow.getCell(5).toString();
		String gender = curRow.getCell(6).toString();
		String days = curRow.getCell(7).toString();
		String time = curRow.getCell(8).toString();

		// Entering values to form
		/*driver.findElement(By.id("RESULT_TextField-1")).sendKeys(firstName);
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys(lastName);
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys(phone);
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys(country);
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys(city);
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys(email);

		// Condition for gender selection which is a webtable
		if (gender.equals(
				driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[1]/td/label")).getText())) {
			driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[1]/td")).click();
		} else if (gender.equals(
				driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[2]/td/label")).getText())) {
			driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[2]/td")).click();
		} else {
			System.out.println("No gender specified");
		}*/

		//Select days from webtable using for loop
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<2;j++)
			{
				WebElement web = driver.findElement(By.xpath("html/body/form/div[2]/div[17]/table/tbody/tr["+i+"]/td/label"));
				if(web.getText().equals(days))
				{
					web.click();
				}
				
			}
		}
		
		
		
		
		
		// driver.findElement(By.id("RESULT_TextField-1")).sendKeys(time);

		// }

	}

}
