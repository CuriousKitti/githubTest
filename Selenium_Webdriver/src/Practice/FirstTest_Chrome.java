//Open google.com using Chrome WebDriver

package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Testing/Eclipse/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); //create an object of ChromeDriver class
		
		driver.get("https://www.google.com"); //open google.com
		String title = driver.getTitle(); //Get title of page
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl()); //Get current URL from browser
		driver.quit();
		
		
	}

}
