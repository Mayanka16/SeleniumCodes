package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://www.spicejet.com");

		// WebElement date =
		// driver.findElement(By.id("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]"));
		WebElement date = driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep"));
		String dateVal = "01-01-2024";

		selectDateByJS(driver, date, dateVal);

	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].setAttribute('value','" + dateVal + "');", element);

	}

}
