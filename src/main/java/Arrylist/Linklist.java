package Arrylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linklist {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		
		List<WebElement> sc= driver.findElements(By.tagName("div"));
		int total = sc.size();
		System.out.println(total);
		//System.out.println(sc.size());
		
		List<WebElement> sc2 = driver.findElements(By.tagName("script"));
		int total1=sc2.size();
		System.out.println(total1);
		
		System.out.println("Total Tagname 'Div' :" + total);
		System.out.println("Total Tagname 'script' :" + total1);
		driver.close();
		
		
		
		

	}

}
