package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayanka/Documents/Study Material/Automation/chromedriver-mac-x64-2/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

//		driver.get("https://jqueryui.com/droppable/");
//		
//		driver.switchTo().frame(0);
//		Actions action = new Actions(driver);
//		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
//		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
//		.release()
//		.build()
//		.perform();
//		driver.quit();
//		

		// without Actions class and using JavascriptExecutor
		driver.get("file:///C:/Users/thaku/Desktop/WebSite/DragAndDropAnimal.html");  // URL not working

		driver.manage().window().maximize();

		WebElement alligatorImage = driver.findElement(By.xpath("//img[@src='Animals/Alligator.png']"));
		WebElement alligatorBox = driver.findElement(By.xpath("//div[@id='div7']"));

		WebElement elephantImage = driver.findElement(By.xpath("//img[@src='Animals/Elephant.png']"));
		WebElement elephantBox = driver.findElement(By.xpath("//div[@id='div6']"));

		Thread.sleep(2000);
		dragAndDrop(driver, alligatorImage, alligatorBox);

		Thread.sleep(2000);
		dragAndDrop(driver, elephantImage, elephantBox);

	}

	public static void dragAndDrop(WebDriver driver, WebElement srcElement, WebElement tarElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				+ "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				+ "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				+ "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				+ "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				+ "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				+ "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				+ "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				+ "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				+ "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				+ "var dropEvent = createEvent('drop');\n"
				+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				+ "var dragEndEvent = createEvent('dragend');\n"
				+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				+ "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				+ "simulateHTML5DragAndDrop(source,destination);", srcElement, tarElement);

	}

}
