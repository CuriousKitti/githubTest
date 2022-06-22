package BasicTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUps {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D://Testing//Eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	    alert.accept();	//to click OK
	  //alert.dismiss(); // to click Cancel
	    
	 		
		
	}

}
