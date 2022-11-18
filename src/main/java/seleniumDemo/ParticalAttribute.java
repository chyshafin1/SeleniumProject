package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParticalAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("DemoSlaesManager");
		driver.findElementByXPath("//input[contains(@id,'p')]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'d')]").click();
driver.close();
	}

}
