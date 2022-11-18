package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();*/ //webdriver formula 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
         Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click(); 
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();
		 
		 
		
		
	}

}
