package selenium;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
	WebDriver driver = new HtmlUnitDriver();
	
	driver.get("https://www.google.com");
	
	// global wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

	List<WebElement> link = driver.findElements(By.tagName("a"));
	System.out.println(link.size());

	for (int i = 0; i < link.size(); i++) {
		String linkName = link.get(i).getText();
		System.out.println(linkName);

	}

}
}
