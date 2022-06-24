package dataDrivenTests;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.testData;

public class loginTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dollardays.com/");

	}

	@DataProvider
	public Iterator<Object[]> getTestData() throws EncryptedDocumentException, IOException {

		ArrayList<Object[]> finaltestData = testData.readFromExcel();
		return finaltestData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void login(String uname, String pwd, String name) {

		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='inputLoginUsername']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='inputLoginPassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//img[@class='header-user']")).click();
		String actual_name = driver.findElement(By.xpath("//li[@class='account-title']")).getText();
		Assert.assertEquals(actual_name, name);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
