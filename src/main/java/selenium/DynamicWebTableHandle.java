package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		
		//Method 1 and preferrable
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='p_90/6741118031']/span/a/div/label/i")).click();
		
		
		
		//Method 2 and lengthy

//		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/");
//		String before_xpath = "//input[@value='option-";
//		String after_xpath = "']";
//
//		for (int i = 1; i <= 4; i++) {
//			System.out.println(before_xpath + i + after_xpath);
//
//			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			System.out.println(name);
//			if (name.contains("Option 4")) {
//				driver.findElement(By.xpath("before_xpath[" + i + "]after_xpath")).click();
//				System.out.println("selected");
//			} else {
//				System.out.println("Failed" + name);
//
//			}

		}

	}

