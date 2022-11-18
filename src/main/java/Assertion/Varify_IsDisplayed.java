package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;


public class Varify_IsDisplayed {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		boolean logo = driver.findElementByXPath("//div[@id='logo']/img").isDisplayed();
	
		if(logo==true) {
			System.out.println("Logo is Visible");
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

