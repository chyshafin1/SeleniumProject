package multiBrowserSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	//@Test
	//public void createLead() {
		public static void main(String[]args ){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("crmsfa");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		driver.quit();
	}
}
