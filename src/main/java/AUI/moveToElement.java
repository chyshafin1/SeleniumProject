package AUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement content = driver.findElementByXPath("//a[@class='menulink']");
		action.moveToElement(content).perform();
		//Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Articles']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//img[@class='logo-mrbool']").click();
		
		WebElement content2 = driver.findElementByXPath("//a[@class='menulink']");
		action.moveToElement(content2).perform();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//ul[@class='submenu']").click();
		
        driver.findElementByXPath("//img[@class='logo-mrbool']").click();
        
        WebElement content3 = driver.findElementByXPath("//a[@class='menulink']");
		action.moveToElement(content3).perform();
		
		driver.findElementByXPath("//ul[@class='submenu']/li [3]").click();
		
		driver.findElementByXPath("//img[@class='logo-mrbool']").click();
        
		driver.close();
		}

}
