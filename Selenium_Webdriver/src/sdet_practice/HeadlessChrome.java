package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://Testing//Eclipse//chromedriver.exe");
		ChromeOptions options = new ChromeOptions().setHeadless(true);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());

	}

}
