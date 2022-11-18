package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearnTestNG2 {

	@Test
	
	public void learntestng2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
                                

      //ChromeDriver driver = new ChromeDriver();
  	  ChromeDriver driver = new ChromeDriver();
  	  
  	driver.get("http://leaftaps.com/opentaps/control/main"); 
  	
  	driver.manage().window().maximize();
  	  
  	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	  
	//driver.getTitle();
	System.out.println(driver.getTitle());	
		
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	Thread.sleep(1000);
	
	driver.findElementByLinkText("CRM/SFA").click();
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
	
	WebElement mcn = driver.findElementById("createLeadForm_marketingCampaignId");
	Select dd2 = new Select(mcn);
	dd2.selectByValue("CATRQ_AUTOMOBILE");
	
	Thread.sleep(1000);
	
	driver.findElementById("createLeadForm_personalTitle").sendKeys("solve");
	
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Chy");
	
	//driver.findElementById("createLeadForm_birthDate").sendKeys("12/25/1990");
	driver.findElementByName("generalProfTitle").sendKeys("ABC");
	
	driver.findElementById("createLeadForm_departmentName").sendKeys("Account Section");
	
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
	Thread.sleep(1000);
	
	 WebElement pcy = driver.findElementById("createLeadForm_currencyUomId");
	Select dd3 = new Select(pcy);
	dd3.selectByVisibleText("AMD - Armenian Dram");
	
	WebElement ids = driver.findElementById("createLeadForm_industryEnumId");
	Select dd4 = new Select(ids);
	dd4.selectByVisibleText("Computer Software");
	
    WebElement own =  driver.findElementById("createLeadForm_ownershipEnumId");
    Select dd5 = new Select(own);
    dd5.selectByVisibleText("Sole Proprietorship");
    
    driver.findElementByName("numberEmployees").sendKeys("100");
    
    driver.findElementById("createLeadForm_sicCode").sendKeys("555");
    
    driver.findElementById("createLeadForm_tickerSymbol").sendKeys("99");
    driver.findElementByName("description").sendKeys("in am fine");
    driver.findElementByName("importantNote").sendKeys("fine also");
    driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456789");
    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("3");
    driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("xxx");
    driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("2");
    driver.findElementById("createLeadForm_primaryEmail").sendKeys("hdadgagduy@gmail.com");
    driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
    driver.findElementById("createLeadForm_generalToName").sendKeys("yyyy");
    driver.findElementById("createLeadForm_generalAttnName").sendKeys("xyz");
    driver.findElementById("createLeadForm_generalAddress1").sendKeys("xyzert");
    driver.findElementById("createLeadForm_generalAddress2").sendKeys("xysds");
    driver.findElementById("createLeadForm_generalCity").sendKeys("Mechigan");
  
    WebElement st = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
    Select dd6 = new Select(st);
    dd6.selectByValue("AZ");
    driver.findElementByName("generalPostalCode").sendKeys("12345");
    driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("67890");
   
    WebElement  cou = driver.findElementById("createLeadForm_generalCountryGeoId");
    Select dd7 = new Select(cou);
    dd7.selectByVisibleText("United Kingdom");
    driver.findElementByName("submitButton").click();
    Thread.sleep(3000);
	
    driver.close();	
	Thread.sleep(5000);

}
}

