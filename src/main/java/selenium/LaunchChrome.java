package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);

		if(title.equals("Google")){
			System.out.println("Correct Title");

		}
		else {
			System.out.println("In-Correct Title");
		}
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();







	}

}
