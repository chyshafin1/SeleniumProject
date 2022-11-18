package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
		
		//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">

		driver.findElementByCssSelector("#usename").sendKeys("DemoSalesManager");//id
		driver.findElementByCssSelector(".inputLogin").sendKeys("DemoSalesManager");//class
		driver.findElementByCssSelector("input[name='USERNAME']").sendKeys("DemoSalesManager");//name
		driver.findElementByCssSelector("input[type='text']").sendKeys("DemoSalesManager");//type
		driver.findElementByCssSelector("input[size='50']").sendKeys("DemoSalesManager");//size
		
		driver.findElementByCssSelector("input[id^='u']").sendKeys("DemoSalesManager");//start with
		driver.findElementByCssSelector("input[id$='e']").sendKeys("DemoSalesManager");//end with
		driver.findElementByCssSelector("input[id*='e']").sendKeys("DemoSalesManager");//contains
		
		driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");//parent to child
		driver.findElementByCssSelector("label[for='username']+input").sendKeys("DemoSalesManager");//sibling to sibling
	}

}
