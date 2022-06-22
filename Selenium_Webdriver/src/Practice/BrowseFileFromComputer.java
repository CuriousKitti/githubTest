//File upload example(Browse /select file from computer)

package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFileFromComputer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@id=\"fileupload\"]")).sendKeys("C:\\Users\\windows gallery\\Desktop\\Reminder.txt");
			
		driver.quit();
	}

}
