package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

		driver.get("https://www.google.com/?client=safari");
		driver.findElement(By.id("APjFqb")).sendKeys("Testing");
		List<WebElement> list = driver
				// .findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d
				// WggQGd']"));
				// .findElements(By.xpath("//*[@id='jZ2SBf']/div[1]"));
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='presentation'][1]"));

		System.out.println("Total Number of Suggestions in Search Box are : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		driver.quit();

	}

}
