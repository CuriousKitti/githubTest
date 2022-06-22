package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		

	}

}
