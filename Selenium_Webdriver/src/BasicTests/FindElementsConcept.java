package BasicTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are :"+linkList.size());
		
		for(int i=0; i<linkList.size(); i++){
			System.out.println(linkList.get(i).getText());
		}
		
	}
		

}
