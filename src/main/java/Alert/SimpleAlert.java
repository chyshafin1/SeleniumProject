package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe\\");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElementById("searchBtn").click();
			Thread.sleep(3000);
			String simpleAlertTxt= driver.switchTo().alert().getText();
			System.out.print(simpleAlertTxt);
			driver.switchTo().alert().accept();
			
			
			Thread.sleep(3000);
			driver.close();
			
	}

}
