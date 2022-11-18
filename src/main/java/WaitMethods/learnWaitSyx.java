package WaitMethods;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class learnWaitSyx {

	public static void main(String[] args) throws InterruptedException {
		
	
			System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		                               
			//WebDriver driver = new ChromeDriver();
			ChromeDriver driver = new ChromeDriver();
	      	driver.get("http://leaftaps.com/opentaps/control/main"); 
	      	
	      	driver.manage().window().maximize();
	      	
	      	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      	
	      	try{
	      		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	      		System.out.println("SendKeys taken");
	      	}
	      	catch(Exception e){
	      		System.err.println("SendKeys not taken");
	      	}
	      
	      	finally {
			 System.out.println("The element found");
			}
	      	
	      	driver.findElement(By.id("password")).sendKeys("crmsfa");
	      	driver.findElement(By.className("decorativeSubmit")).click();
	    	Thread.sleep(3000);
	      	driver.findElement(By.linkText("CRM/SFA")).click();
	      	driver.findElement(By.linkText("Create Lead")).click();
	    	WebDriverWait wait = new WebDriverWait(driver,10);
	      	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Lead")));
	      	System.out.println("Test case complete");
	      	driver.close();

	}

}
