package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://Testing//Eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cheapoair.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mexico Flights")).click();
		driver.quit();

	}

}
