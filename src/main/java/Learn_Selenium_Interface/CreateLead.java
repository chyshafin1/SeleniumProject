package Learn_Selenium_Interface;

import org.testng.annotations.Test;

public class CreateLead extends GenericWrapper{

	@Test
	public void createLead() {
		login("http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterByXpath("//input[@id='password']","crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", "ABC");
		enterById("createLeadForm_firstName", "xyz");
		enterByName("lastName","efg");
		chooseByIdText("createLeadForm_dataSourceId","Website");
		clickByName("submitButton");
		try {
		clickByLinkText("Accounts1");
		System.out.println("click taken");
      	}
		catch(Exception e) {
	      	  System.err.println("click not taken");
	    }
		clickByLinkText("Activities");
		System.out.println("Test Case Complete");
		closeBrowser();
	}
}
