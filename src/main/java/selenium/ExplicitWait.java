package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com");

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//a[text()='Movies']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Dunki']")));
		driver.findElement(By.xpath("//div[text()='Dunki']")).click();

		driver.navigate().back();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Kaatera']")));
		driver.findElement((By.xpath("//div[text()='Kaatera']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@id='super-wrapper']/div/div[2]/section[1]/div/div/div[1]/section/div/div[@class='sc-xta4k3-0 SuaFt']/span")));

		driver.close();

	
}
}
