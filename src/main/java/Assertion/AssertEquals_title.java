package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEquals_title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title is not  Matched");
		}
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.close();
			
		}
			
	}
