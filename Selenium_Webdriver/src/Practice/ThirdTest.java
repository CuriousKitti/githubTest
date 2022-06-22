package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Testing//Eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//Login to FreeCRM account
		driver.get("https://freecrm.com/");	
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("snehadhande25@gmail.com");
		System.out.println("hi there");
		
	//Register New user	
		
		//driver.get("https://freecrm.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.id("email")).sendKeys("xyzabc@gmail.com");
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("xyzabc@gmail.com");
		
		//driver.findElement(By.xpath("//input[@id=\"phone_number\"]")).sendKeys("4858585554");
		//driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();
	    
		//WebElement captcha = driver.findElement(By.id("rc-anchor-container"));
		//driver.switchTo().frame(captcha);
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("recaptcha-anchor")).click();
		
		//driver.findElement(By.id("country")).click();
		//Select select = new Select(driver.findElement(By.id("country")));
		//select.selectByIndex(0)

		 /*List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id=\"country\"]//div"));
	        System.out.println(allOptions.size());
	         
	                 
	                 
	        for(int i = 0; i<=allOptions.size()-1; i++) {
	             
	             
	            if(allOptions.get(i).getText().contains("mn")) {
	                 
	                allOptions.get(i).click();
	                break;
	                 
	            }
	        }*/
		
		
	}

}
