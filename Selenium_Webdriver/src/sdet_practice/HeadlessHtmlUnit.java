package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnit {

	public static void main(String[] args) {
	
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.rakuten.com");
	
		System.out.println(driver.getTitle());
	
	}

}
