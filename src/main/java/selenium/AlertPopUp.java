package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");

		String popUpMessage = "Please enter a valid user name";
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();

		if (alertMessage.equals(popUpMessage)) {
			System.out.println("The Pop-Up has been detected");
		} else {
			System.out.println("The Pop-Up has not been detected or wrong message. Please check!!!");
		}
		alert.accept();
		// alert.dismiss();
		driver.quit();

	}

}
