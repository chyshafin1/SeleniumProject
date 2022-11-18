package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfElseVerificationTitle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
		String tl = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println("View Page Title= "+tl);
		if (tl.contains("Leaf")) {
			System.out.println("Verfication sussesfully");
		}else {
			System.out.println("Verfication Failed");
		}

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		String ti = driver.getTitle();
		System.out.println(driver.getTitle());
		
		System.out.println("View Page Title  = "+ti);
		if(ti.contains("My")) {
			System.out.println("Varifaction Pass");
		}else {
			System.out.println("Varifaction fail");
		}
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("25255");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		WebElement dis = driver.findElementByXPath("//div[@class='x-paging-info']");
		dis.getText();
		System.out.println(dis.getText());
		if(dis.getText().equals("No records to display")) {
			System.out.println("Varifaction Pass");
		}else {
			System.out.println("Varifaction not Pass");
		}
		
		
		driver.close();
	}

}
