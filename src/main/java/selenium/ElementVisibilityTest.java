package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");

	//	WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));

		driver.get("https://in.bookmyshow.com");
		//driver.get("in.bookmyshow.com");  //without https - InvalidArgumentException
		
		//1. isDisplayed() is applicable for all element
//		boolean b1 = driver.findElement(By.xpath("//span[text()='Bengaluru']")).isDisplayed(); // bengaluru is displayed
//		System.out.println(b1);
		
		//2. isEnabled() - few of the box when click above than gets enabled
//		boolean b1 = driver.findElement(By.xpath("//span[text()='Bengaluru']")).isEnabled();
//		System.out.println(b1);
//		
		//3. isSelected() this is only applicable for dropdown, checkbox and radio button
		boolean b1 = driver.findElement(By.xpath("//span[text()='Bengaluru']")).isSelected();
		System.out.println(b1);
		driver.close();
	}

}