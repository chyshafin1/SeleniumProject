package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		 System.setProperty("webdriver,chrome,driver" ,"C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 
		 driver.manage().window().maximize();
     	  
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 
		 driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSlaesManager");
		 driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[2]/input").sendKeys("crmsfa");
		 driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[3]/input").click();
		 driver.findElementByXPath("/html/body/div[2]/div[2]/div/div/div/a").click();
		 driver.quit();

	}

}
