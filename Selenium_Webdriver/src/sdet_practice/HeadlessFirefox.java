package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\Eclipse\\geckodriver.exe");
		
//		FirefoxOptions options = new FirefoxOptions().addArguments("--Headless");
//OR	options.setHeadless(true);
//OR	options.addArguments("--Headless");
		
		FirefoxOptions options = new FirefoxOptions().setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
