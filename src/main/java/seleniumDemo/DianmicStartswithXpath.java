package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class DianmicStartswithXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.prothomalo.com/");
        driver.findElementByXPath("(//div[starts-with(@class,'hamburger')]) [3]").click();
        driver.findElementByXPath("(//span[starts-with(@class,'headline-co')]) [7]").click();
        Thread.sleep(3000);
driver.close();
		
		

	}

}
