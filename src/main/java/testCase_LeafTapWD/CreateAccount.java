package testCase_LeafTapWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_WbDvr;

public class CreateAccount extends ProjectSpecificWrapper_WbDvr{
	
	@Test
	public void createAccount() {
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("hdhfdjd");
		driver.findElement(By.id("groupNameLocal")).sendKeys("saving");
		driver.findElement(By.id("annualRevenue")).sendKeys("50000");
		
		WebElement pcur =driver.findElement(By.id("currencyUomId"));
		Select dd = new Select(pcur);
		dd.selectByValue("AED");
		driver.findElement(By.cssSelector("input[class='smallSubmit']")).click();
		
	}
	
}
