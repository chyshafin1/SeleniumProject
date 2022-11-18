package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Screenshot_TestNG {

	@Test
	public void screenShot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		 driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		 driver.findElementByXPath("//div[@id='label']").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
			
			// enter firstName
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);

			// enter lastName
			driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
			//driver.findElementById("createLeadForm_lastName").sendKeys(lName);

			Thread.sleep(2000);
			// Choose source
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");

			// choose industry
			WebElement element = driver.findElementById("createLeadForm_industryEnumId");
			Select dd1 = new Select(element);
			dd1.selectByVisibleText("Insurance");

			// choose ownership
			WebElement ele = driver.findElementByName("ownershipEnumId");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");
			
			File sc1 = driver.getScreenshotAs(OutputType.FILE);
			File dst1 = new File("C:\\Users\\chowd\\OneDrive\\Desktop\\scrn\\image.png");
			FileUtils.copyFile(sc1, dst1);
			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();
			
			File sc2 = driver.getScreenshotAs(OutputType.FILE);
			File dst2 = new File("./snap/img.png");
			FileUtils.copyFile(sc2, dst2);
			
			driver.close();

		}	
		
	}