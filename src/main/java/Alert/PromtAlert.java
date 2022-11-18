package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		

		Alert PromtAlert = driver.switchTo().alert(); 
		PromtAlert.getText();
		System.out.println(PromtAlert.getText());
		Thread.sleep(3000);
		PromtAlert.sendKeys("I am robot");
		Thread.sleep(3000);
		PromtAlert.accept();
		//String text = driver.findElement(By.id("result")).getText();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//driver.switchTo().alert().accept();
		
		driver.close();

	}

}
