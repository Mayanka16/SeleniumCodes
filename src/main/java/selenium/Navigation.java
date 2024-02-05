package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");

		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		//Forward and Backward
		driver.get("https://www.google.com"); // google
		driver.get("https://www.amazon.com");  // amazon
		//driver.navigate().to("https://www.amazon.com");
		
		driver.navigate().back(); 
		Thread.sleep(2000);
		System.out.println("Current page is = "+ driver.getTitle()); // google
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("Current page is = "+ driver.getTitle()); // amazon
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Current page is = "+ driver.getTitle()); // google
		
		
		driver.navigate().refresh(); // refresh the page
		
		
		
		driver.close();
	
		
	}

}
