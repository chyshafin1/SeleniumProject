package IntergateDataProWExcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DataProvider_CreateLead extends ProjectSpacificWrapper {

	@Test(dataProvider = "getData")
	public void dataProvider(String Cname, String Fname , String Lname) throws InterruptedException {
	driver.findElementByLinkText("Leads").click();

	// click create lead link
	driver.findElementByLinkText("Create Lead").click();

	// Company name
	driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	
	// enter firstName
	driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(Fname);
	//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);

	// enter lastName
	driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
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

	// Click Create lead
	driver.findElementByXPath("//input[@name='submitButton']").click();

}

}
