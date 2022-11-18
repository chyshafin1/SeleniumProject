package FrameWork;


import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1_jquary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Selectable']").click();
		
	   //driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	   driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	     
	   driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
	   Thread.sleep(3000);
	   driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
	   driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
	   Thread.sleep(2000);
	   driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
	 
	   driver.switchTo().parentFrame();
	   driver.findElementByXPath("//a[text()='Demos']").click();
	   driver.close();
	}

}
