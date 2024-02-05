package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/");

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//		Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));
//		select.selectByIndex(2);
//		select.selectByValue("sql");
//		select.selectByVisibleText("Python");
//		select.selectByValue("python");

		List<WebElement> list = driver.findElements(By.xpath("//div[@id='checkboxes']//label"));
		System.out.println("Size of the elements are = " + list.size());

		// selecting option 2
//		for (int i = 0; i < list.size(); i++) {			
//				if (list.get(i).getText().contains("Option 2")) {
//				list.get(i).click();
//
//				break;
//			}
//		}

		// selecting all dropdown
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		

			list.get(i).click();
		}

		driver.close();

	}

}
