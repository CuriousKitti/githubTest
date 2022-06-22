//Location popup handle

package Practice;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> contentSettings = new HashMap<String, Object>();
		HashMap<String, Object> profi = new HashMap<String, Object>();
		HashMap<String, Object> pref = new HashMap<String, Object>();
		
		contentSettings.put("geolocation", 1);
		profi.put("managed_default_content_settings", contentSettings);
		pref.put("profile", profi);
		options.setExperimentalOption("prefs", pref);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://my-location.org/");
		
		
	
		
		
	}

}
