package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		driver.get("https://www.spicejet.com");
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.linkText("SpiceClub"))).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(text(),'Use Points')]")).click(); (error in catching xpath)
		System.out.println("The page has been closed");

		driver.quit();

	}

}
