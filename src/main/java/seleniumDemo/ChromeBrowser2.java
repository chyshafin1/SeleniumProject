package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		

	}
	
}
