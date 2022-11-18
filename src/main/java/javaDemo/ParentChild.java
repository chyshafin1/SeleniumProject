package javaDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\chowd\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
		driver.close();
	
		
	}

}
