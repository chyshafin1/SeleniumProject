package wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper_WbDvr {

	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Actions action = new Actions (driver);
		//action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.close();
	}
	
}
