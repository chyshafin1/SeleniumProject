package testCase_LeafTapWD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_WbDvr;

public class CreateContract extends ProjectSpecificWrapper_WbDvr{
	@Test
	public void createContract() {
		 System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.xpath("//a[contains(text(),' Contacts')]")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("abchf");
		driver.findElement(By.id("lastNameField")).sendKeys("thgkj");
		
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
