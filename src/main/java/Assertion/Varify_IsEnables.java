package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class Varify_IsEnables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		
		boolean enabled = driver.findElementByXPath("//input[@id='remID']").isEnabled();
		
		if (enabled==true) {
			System.out.println("is enabled");
		}else {
			System.out.println("is not enabled");
		}
		Thread.sleep(3000);
		driver.close();

	}

}