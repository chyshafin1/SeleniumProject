package learnTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethd {
	public ChromeDriver driver;
	@BeforeMethod
		public void login() {
			System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
			driver = new ChromeDriver();
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
	}
			
			@Test(priority=2)
			public void CreateLead() throws InterruptedException {
			driver.findElementByLinkText("Create Lead").click();
			Thread.sleep(1000);
			
			driver.findElementById("createLeadForm_companyName").sendKeys("TCM");
			driver.findElementById("createLeadForm_firstName").sendKeys("Shafin");
			driver.findElementById("createLeadForm_lastName").sendKeys("Chy");
			Thread.sleep(1000);
			
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Conference");
			
			driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Shafin");
			
			}
			
			@Test(priority=2)
			public void Leads(){
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
			}

			@AfterMethod
			public void logout() {
			driver.close();
		}

		}

