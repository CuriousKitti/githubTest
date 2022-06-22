//Drag and drop example 
package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //Maximize browser window
		driver.manage().deleteAllCookies(); //Delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
		.build().perform();
		
		//action.clickAndHold(driver.findElement(By.id("draggable"))).
		//moveToElement(driver.findElement(By.id("droppable"))).release().perform();


	}

}
