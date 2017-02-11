package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/aanvazhapilly/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");

		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.google.com");
		cd.quit();
		
	}

}
