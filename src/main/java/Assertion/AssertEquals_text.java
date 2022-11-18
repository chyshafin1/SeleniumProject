package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEquals_text {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.navigate().to("http://leaftaps.com/opentaps/control/main");

			String text =driver.findElementByXPath("//label[text()='Username']").getText();
			Assert.assertEquals(text, "Username");
			
			if(text.equals("Username")){
				System.out.println("Username is displayed");
			}else {
				System.out.println("Username is not displayed");
			}
			
			driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
			driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
			driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
			driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
			driver.close();
				
			}
				
		}


