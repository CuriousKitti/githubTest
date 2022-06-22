//Open google.com using FireFox WebDriver

package Practice;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTest_FF {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","D://Testing//Eclipse//geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","D://Testing//Eclipse//geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver(); //Invoke the browser
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("Test-Case passed");
		}
		else
		{
			System.out.println("Test-Case failed");
		}
		driver.quit();
	}

}
