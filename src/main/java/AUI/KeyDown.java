package AUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		Thread.sleep(3000);
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		Thread.sleep(3000);
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions action = new Actions(driver);
		
	//action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).release().perform();
	action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).perform();
	driver.close();
	}

}
