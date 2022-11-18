package TryCatch;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCat {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); 
      	
      	driver.manage().window().maximize();
      	
      	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      	
      	driver.findElementById("username").sendKeys("DemoSalesManager");
      	 
        driver.findElementById("password").sendKeys("crmsfa");
      	
      	driver.findElementByClassName("decorativeSubmit").click();
		//Thread.sleep(1000);
		
    
    	driver.findElementByLinkText("CRM/SFA").click();
		try {
		driver.findElementByLinkText("Create Lead").click();
		 System.out.println("click taken");
      	}
    	catch(Exception e) {
      	  System.err.println("click not taken");
        	}

		finally {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dst = new File("./snap/img3.png");
			FileUtils.copyFile(src, dst);
	      	}
		driver.findElementByLinkText("Accounts").click();
		System.out.println("Test Complete");
		driver.close();

	}

}
