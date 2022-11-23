package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByLinkText("Droppable").click();
	
		WebElement src = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(src);
		
		 //driver.switchTo().frame(0);
		
		//driver.switchTo().frame(driver.findElementByCssSelector(".demo-frame"));
		
		WebElement abc = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dst = driver.findElementByXPath("//div[@id='droppable']");
		
		Actions action = new Actions(driver);
		action.dragAndDrop(abc, dst).perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.close();
		
		
	
	}

}