package mse.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'java.io')]")).click();
		
		driver.quit();

	}

}
