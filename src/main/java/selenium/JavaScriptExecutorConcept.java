package selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");

		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));

		// driver.get("https://in.bookmyshow.com");
		driver.get("https://www.amazon.com");
		// driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(5000);
		// WebElement place = driver.findElement(By.xpath("//div[text()='Sign in']"));
		WebElement place = driver
				.findElement(By.xpath("//input[@value='Go'] | //a[@text()='Customer Service'] | //input[@value='Go']"));

		flash(place, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(255,255,0)", element, driver);
			changeColor(bgcolor, element, driver);

		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].style.backgroundColor='" + color + "'", element);

		driver.close();

	}
}
