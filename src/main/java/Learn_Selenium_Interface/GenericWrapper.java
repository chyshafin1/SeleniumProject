package Learn_Selenium_Interface;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{

	public ChromeDriver driver;

	public void login(String url) {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void enterById(String locatorValue, String Data) {
		driver.findElementById(locatorValue).sendKeys(Data);
		
	}

	public void enterByName(String locatorValue, String Data) {
		driver.findElementByName(locatorValue).sendKeys(Data);
		
	}

	public void enterByClass(String locatorValue, String Data) {
		driver.findElementByClassName(locatorValue).sendKeys(Data);	
	}

	public void enterByXpath(String locatorValue, String Data) {
		driver.findElementByXPath(locatorValue).sendKeys(Data);
		
	}

	public void enterByCSS(String locatorValue, String Data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(Data);
		
	}

	public void clickById(String lacotorValue) {
		driver.findElementById(lacotorValue).click();
		
	}

	public void clickByName(String lacotorValue) {
		driver.findElementByName(lacotorValue).click();
		
	}

	public void clickByClass(String lacotorValue) {
		driver.findElementByClassName(lacotorValue).click();
		
	}

	public void clickByXpath(String lacotorValue) {
		driver.findElementByXPath(lacotorValue).click();
		
	}

	public void clickByCSS(String lacotorValue) {
		driver.findElementByCssSelector(lacotorValue).click();
		
	}

	public void clickByLinkText(String lacotorValue) {
		driver.findElementByLinkText(lacotorValue).click();
	}
//mamun bai gave selectVisibleTextById
	public void chooseByIdText(String lacotorValue ,String Data) {
		WebElement ele = driver.findElementById(lacotorValue);
		Select dd = new Select(ele);
		dd.selectByVisibleText(Data);
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
}
