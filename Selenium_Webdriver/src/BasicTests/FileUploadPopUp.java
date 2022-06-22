package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D://Testing//Eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Browse file through desktop
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@id=\"fileupload\"]")).sendKeys("C:\\Users\\windows gallery\\Desktop\\Reminder.txt");
		


	}

}
