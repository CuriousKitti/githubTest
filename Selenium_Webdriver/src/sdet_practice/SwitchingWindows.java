package sdet_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("click")).click();
		
		Set <String> s =driver.getWindowHandles();
		String title = "Selenium";
		
		for(String i:s)
		{
			driver.switchTo().window(i);
			if(driver.getTitle().equals(title))
			{
				String header = driver.findElement(By.xpath("//*[@id=\"td-cover-block-0\"]/div/div/div/div/h1")).getText();
				System.out.println(header);
			}

		}
		driver.quit();
	}

}
