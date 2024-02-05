package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadPropFile {
	static WebDriver driver; // declaring universal 

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"/Users/mayanka/eclipse-workspace/SeleniumProject/src/main/java/selenium/config.properties");
		// FileInputStream - It will create a InputStream between java code and
		// config.properties file
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		// System.out.println(prop.get("name"));

		System.out.println(prop.getProperty("Age"));
		System.out.println(prop.getProperty("url"));

		String url = prop.getProperty("url");
		System.out.println(url);

		String browser = prop.getProperty("browser");
		System.out.println(browser);

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equals("safari")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
			driver = new SafariDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
			driver = new InternetExplorerDriver();
		

		}
		driver.get(url);
		
		
	}

}
