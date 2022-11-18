package AUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		 
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[text()='Droppable']").click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		Thread.sleep(3000);
		WebElement from = driver.findElementByXPath("//div[@id='draggable']");
		WebElement to = driver.findElementByXPath("//div[@id='droppable']");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(from,to).perform();
		
		driver.close();
		
		
		
		
	}

}
