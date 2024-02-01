package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iloveimg.com/compress-image");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Select images"))
				.sendKeys("/Users/mayanka/Documents/Youtube Videos/Baingan/IMG_1192.JPG");
		 Thread.sleep(2000);
		 System.out.println("Able to select image.");
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
		
	}

}
