package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			String url = "http://prova.stefanini-jgr.com.br/teste/qa/";
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();

		}
		return driver;
	}

	public static void close() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}

}
