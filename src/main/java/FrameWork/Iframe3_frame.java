package FrameWork;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Iframe3_frame {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@value='Doe']").clear();
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("qwe");
		driver.findElementByXPath("//input[@value='Submit']").click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElementByXPath("(//button[@id='runbtn']) [1]").click();
		driver.close();

	}

}
