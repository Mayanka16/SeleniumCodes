package selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Downloads/chromedriver-mac-x64/chromedriver");

		WebDriver driver = new ChromeDriver();
		// driver.get(
		// "https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		// 1.xpath

		// driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Mayanka Sao");
		// driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("9827735380");
		// driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Number123@");
		// driver.findElement(By.xpath("//*[@id='continue']")).click();

		// 2. id
		// 3. cssSelector

		// driver.findElement(By.cssSelector("*[type='text']")).sendKeys("Mayanka Sao");

		// 4. name
		// 5. tagName
		// 6. linkText

		// driver.findElement(By.linkText("Sign in")).click();

		// 7. className
		// 8. partialLinkText (not useful)

/// comparision in xPath and cssSelector
//		Instant startTime = Instant.now();
//		System.out.println(startTime.toString());

		// xPath
//		 driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Mayanka Sao");
//		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("9827735380");
//		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Number123@");
//		driver.findElement(By.xpath("//*[@id='continue']")).click();
		// cssSelector
//		driver.findElement(By.cssSelector("*[type='text']")).sendKeys("Mayanka Sao");
//		driver.findElement(By.cssSelector("*[type='tel']")).sendKeys("9827735380");
//		driver.findElement(By.cssSelector("*[type='password']")).sendKeys("Number123@");
//		driver.findElement(By.cssSelector("*[id='continue']")).click();
//
//		Instant endTime = Instant.now();
//		System.out.println(endTime.toString());
//
//		Duration timeElapsed = Duration.between(startTime, endTime);
//		System.out.println("Time Take : " + timeElapsed.toSeconds() + " milliseconds");
//		driver.quit();

		// findElements
//		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/");
//		driver.manage().window().maximize();
//		List<WebElement> data = driver.findElements(By.id("dropdowm-menu-1"));
//		for (WebElement data1 : data) {
//			System.out.println(data1.getText());
//		}

		// Dynamic Xpath

		driver.get("https://en-gb.facebook.com");
		// driver.findElement(By.xpath("//button[@id='u_0_5_4Y']")); // this will fail
		// as Log In button has dynamic attribute
		// System.out.println(driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")));
		// // using contains

//		System.out.println(driver.findElement(By.linkText("Log in")));
//		System.out.println(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']/descendant::button")));
		// System.out.println(driver.findElement(By.xpath("//button[1]")));

		driver.quit();

	}

}
