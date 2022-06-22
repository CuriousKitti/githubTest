package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Testing\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String exp_title = "Facebook - Log In or Sign Up";
		if (exp_title.equals(driver.getTitle()))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");

		driver.quit();

	}

}
