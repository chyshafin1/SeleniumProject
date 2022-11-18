package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class DanamicContainsXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.target.com/");
		
		driver.findElementByXPath  ("//a[contains(text(),'New')]").click();
		//driver.findElementByXPath("(//span[contains(@class,'Ce')]) [2]").click();
        driver.close();
	}

}
