package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		;

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Ankur");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Patil");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("4585121454");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Pune");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("ankurxyz@gmail.com");

		// Radio Button selection and validation
		//This code can be used to read gender from excel and select accordingly
		boolean s1 = driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected();
		boolean s2 = driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected();
		String gender = driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[2]/td/label"))
				.getText();

		if (gender.equals("Male")) {
			if (s1 == false) {
				driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[1]/td")).click();
			} else {
				System.out.println("Already selected");
			}

		} else if (gender.equals("Female")) {
			if (s2 == false) {
				driver.findElement(By.xpath("html/body/form/div[2]/div[15]/table/tbody/tr[2]/td")).click();
			} else {
				System.out.println("Already selected");
			}
		} else
			System.out.println("No gender specified");

		
		//To select check box
		
		String label = "Saturday";// Instead of defining here , get value from excel
		for(int i=1; i<=7; i++)
		{
			if(label.equals(driver.findElement(By.xpath("html/body/form/div[2]/div[17]/table/tbody/tr["+i+"]")).getText()))
			{
				driver.findElement(By.xpath("html/body/form/div[2]/div[17]/table/tbody/tr["+i+"]/td")).click();			}
		}
		
		
		//Select Drop Down
		
		Select time = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
		time.selectByVisibleText("Afternoon");
		
		//Click on link, navigate back and submit
		
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		driver.navigate().back();
		driver.findElement(By.id("FSsubmit")).click();
		
		
	}

}
