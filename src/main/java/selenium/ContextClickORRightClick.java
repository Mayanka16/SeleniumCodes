package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickORRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(ele).perform();
		driver.quit();
		


	}

}
