package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindow = it.next();
		System.out.println("This is Parent Window : " + parentWindow);

		String childWindow = it.next();
		System.out.println("This is Child Window : " + childWindow);

		driver.switchTo().window(childWindow);
		String childTitle = driver.getTitle();
		System.out.println("Child window Title : "+ childTitle);

		driver.close();
		
		driver.switchTo().window(parentWindow);
		String parentTitle = driver.getTitle();
		System.out.println("Parent window Title : "+ parentTitle);

		driver.close();
	}

}
