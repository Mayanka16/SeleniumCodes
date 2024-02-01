package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

		driver.get("https://www.india.gov.in/calendar");
		String date = "33-December-2023";
		
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		
		String month = dateArr[1];
		String year = dateArr[2];

		String beforeXpath = "//*[@id='calendar-2023-12-";
		String afterXPath = "-date-box']/div/div";

		final int totalDays = 31;
		boolean flag = false;
		try {
			for (int days = 01; days <= totalDays; days++) {
				if (days < 10) {
					String day1 = "0" + days;
					String printingDays = driver.findElement(By.xpath(beforeXpath + day1 + afterXPath)).getText();
					System.out.println("Days are ==> " + printingDays);
					if (day1.equals(day)) {
						String print = "0" + printingDays;
						if (print.equals(day1)) {
							System.out.println("Got the correct date");
							flag = true;
							
							break;
						}
					}
				} else {

					if (days >= 10) {
						String printingDays = driver.findElement(By.xpath(beforeXpath + days + afterXPath)).getText();
						System.out.println("Days are ==> " + printingDays);

						if (printingDays.equals(day)) {
							System.out.println("Got the correct date");
							flag = true;
							break;

						}

					}
				}
			}
			
			
		}catch (Exception e) {
			System.out.println("Error in dates"); 
		}
	}
}
