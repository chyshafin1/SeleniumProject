package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		
		driver.findElementByXPath("//input[@id='remID']").click();
		
		boolean checked = driver.findElementByXPath("//input[@id='remID']").isSelected();
		
		if (checked==true) {
			System.out.println("is chcked");
		}else {
			System.out.println("is not chcked");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
