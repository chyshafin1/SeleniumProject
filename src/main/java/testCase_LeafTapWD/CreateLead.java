package testCase_LeafTapWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_WbDvr;

public class CreateLead  extends ProjectSpecificWrapper_WbDvr{
 
	@Test
	public void createLead(){
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//a[contains(text(),' Leads')]")).click();
		driver.findElement(By.cssSelector("a[href*='createLeadForm']")).click();
		//driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.cssSelector("#createLeadForm_companyName")).sendKeys("TCM");
		driver.findElement(By.cssSelector("#createLeadForm_firstName")).sendKeys("xyz");
		driver.findElement(By.cssSelector("#createLeadForm_lastName")).sendKeys("abc");
		
		WebElement sou =driver.findElement(By.cssSelector("select[name='dataSourceId']"));
		Select dd = new Select(sou);
		dd.selectByValue("LEAD_PARTNER");
		
		WebElement ind =driver.findElement(By.cssSelector("select[name='industryEnumId']"));
		Select dd2= new Select(ind);
		dd2.selectByValue("IND_SOFTWARE");
		
		driver.findElement(By.cssSelector("input[name='submitButton']")).click();
	}
}