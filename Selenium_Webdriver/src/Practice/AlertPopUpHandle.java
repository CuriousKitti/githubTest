//Handle pop up example

package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
		driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		if(alert.getText().equals("Please enter a valid user name")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
			
		alert.accept();
		
	}

}
