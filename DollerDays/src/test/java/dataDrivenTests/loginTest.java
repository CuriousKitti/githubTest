package dataDrivenTests;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.testData;
import locators.webLocators;

public class loginTest {

	public static WebDriver driver;

	public static WebDriver setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dollardays.com/");
		return driver;
	}

	@DataProvider
	public Iterator<Object[]> getTestData() throws EncryptedDocumentException, IOException {

		ArrayList<Object[]> finaltestData = testData.readFromExcel();
		return finaltestData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public static void login(String uname, String pwd) {

		WebElement[] webElement = webLocators.try1();

		WebElement userNameTxtBox, passwordTxtBox, signInBtn;
		userNameTxtBox = webElement[0];
		passwordTxtBox = webElement[1];
		signInBtn = webElement[2];

		userNameTxtBox.sendKeys(uname);
		passwordTxtBox.sendKeys(pwd);
		signInBtn.click();

	}

}
