package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Testing\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//div[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//div[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();

		
		driver.quit();
	}

}
