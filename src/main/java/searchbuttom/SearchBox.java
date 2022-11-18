package searchbuttom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchBox {

	public static void main(String[] args) throws InterruptedException {
	//@Test
	//public void searchBox() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//input[@class='gLFyf gsfi']").sendKeys("Iphone");
		driver.findElementByXPath("(//input[@value='Google Search'])[2]").sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		driver.close();

	}

}
