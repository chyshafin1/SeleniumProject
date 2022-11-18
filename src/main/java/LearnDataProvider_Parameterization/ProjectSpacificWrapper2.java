package LearnDataProvider_Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpacificWrapper2 {
	
	public ChromeDriver driver;

	@Parameters({"url","uname","pwd"})
 
	
	@BeforeMethod
	public void login(String url,String uname, String pwd) {  

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//load URL
		//driver.get("http://leaftaps.com/opentaps");
		driver.get(url);
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Username - (Element level)
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElementById("username").sendKeys(uname);
        driver.findElementByXPath("//input[@id='username']").sendKeys(uname);
		//Enter Password - (Element level)
		//driver.findElementById("password").sendKeys("crmsfa");
		//driver.findElementById("password").sendKeys(pwd);
		driver.findElementByXPath("//input[@id='password']").sendKeys(pwd);
		
		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@AfterMethod
	public void closeBrowser() { 
		driver.close();
	}
	@DataProvider
	public String[][] getData() {
		String [][] data = new String[3][3];
		
		data[0][0] = "TCS";
		data[0][1] = "Sumayla";
		data[0][2] = "Choudhury";
		
		data [1][0] = "ABC";
		data [1][1] = "Mahbub";
		data [1][2] = "Kabir";
		
		data [2][0] = "XYZ";
		data [2][1] = "Moriom";
		data [2][2] = "Akter";
		
		return data;
	}
	
	
	
}

