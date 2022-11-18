package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_true {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		boolean logo = driver.findElementByXPath("//div[@id='logo']/img").isDisplayed();
		Assert.assertTrue(logo,"is Displyed");
		
		if(logo==true) {
			System.out.println("Logo is Displayed");
		}else {
			System.out.println("Logo is not Displayed");
		}
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.close();
			
		}
			
	}


