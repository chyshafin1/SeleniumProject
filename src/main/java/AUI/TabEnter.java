package AUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabEnter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("abc@gamil.com");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@id='pass']").sendKeys("abcd");
		
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		driver.close();
	}

}
