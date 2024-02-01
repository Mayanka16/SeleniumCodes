package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		

		// take ss and store a s a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// now copy the ss to desired location using copyFile method
		// Files.copy(src,new File("/Users/mayanka/eclipse-workspace/SeleniumProject/google.png")); //
		// current project
		Files.copy(src, new File("/Users/mayanka/Documents/ScreenShots/google.png")); // desktop

		System.out.println("Took screenshot");

		driver.close();

	}

}
