package JavaCollectionSet;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionSet {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Try it Yourself »").click();
		
		String FirstWindowRef = driver.getWindowHandle();
		System.out.println(FirstWindowRef);
		
		Set<String> allwinRef = driver.getWindowHandles();
		
		System.out.println(allwinRef);
		
		for ( String Eachwin : allwinRef) {
			System.out.println(Eachwin);
			
			driver.switchTo().window(FirstWindowRef);
			System.out.println(driver.getTitle());
		}
		
		driver.close();		
		
	

	}

}
