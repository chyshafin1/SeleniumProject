package AUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement rclick = driver.findElementByXPath("//span[@class='context-menu-one btn btn-neutral']");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		act.contextClick(rclick).perform();
		 System.out.println("susscessful");
		 driver.close();
		 }

}
