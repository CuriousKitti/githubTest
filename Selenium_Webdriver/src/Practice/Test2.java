//Find out total number of links on amazon.com

package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D://Testing//Eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		List<WebElement> linkList =driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are: "+linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			System.out.println(linkList.get(i).getText());
		}

	}

}
