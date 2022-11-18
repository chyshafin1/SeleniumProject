package IfElaseVerificationTtile;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationaTitle {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main"); 
			String ti = driver.getTitle();	
			System.out.println(driver.getTitle());
			System.out.println("View Page Title= "+ti);
			if(ti.contains("Leaf")) {
				System.out.println("Verification Sussessfully");
			}else {
				System.out.println("Verification not Sussessfully");
			}
			
			driver.manage().window().maximize();
	      	
	      	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      	
	      	driver.findElementById("username").sendKeys("DemoSalesManager");
	      	 
	        driver.findElementById("password").sendKeys("crmsfa");
	      	
	      	driver.findElementByClassName("decorativeSubmit").click();
			Thread.sleep(1000);
			
	    
	    	driver.findElementByLinkText("CRM/SFA").click();
	    	
	    	driver.findElementByLinkText("Create Lead").click();
			
	    	driver.findElementByLinkText("Find Leads").click();
	    	driver.findElementByName("id").sendKeys("25365");

	      	driver.findElementByClassName("x-btn-text").click();
	      	WebElement ta = driver.findElementByClassName("x-btn-text");
	      	ta.getText();
	      	
	    	System.out.println("Test Complete");
			
	    	driver.close();

		}

	}


