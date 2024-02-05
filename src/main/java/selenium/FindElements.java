package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

		driver.get("https://www.google.com");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());

		for (int i = 0; i < link.size(); i++) {
			String linkName = link.get(i).getText();
			System.out.println(linkName);

			//driver.close();
			// driver.quit(); - using this getting error
			// org.openqa.selenium.NoSuchSessionException: Session ID is null. Using
			// WebDriver after calling quit()?

		}
	}

}
