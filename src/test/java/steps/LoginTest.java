package steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
 public ChromeDriver driver;

@Given("Launch Chrome brwser and load url")
public void launch_Chrome_brwser_and_load_url() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
}


@Given("Enter username as (.*)")
public void enter_username_as_DemoSalesManager(String uname) {
   driver.findElementById("username").sendKeys(uname);
}

@Given("Enter Password as (.*)")
public void enter_Password_as_crmsfa(String pwd) {
	driver.findElementById("password").sendKeys(pwd);
}

@When("click the lgoin button")
public void click_the_lgoin_button() {
   driver.findElementByClassName("decorativeSubmit").click();
}

@Then("Its navigate HomePage")
public void its_navigate_HomePage() {
    driver.getTitle();
    System.out.println( driver.getTitle());
}

@Then("click logout button")
public void click_logout_button() {
	  driver.findElementByClassName("decorativeSubmit").click();
}

@Then("close browser")
public void close_browser() {
  driver.close();
}

@Given("Enter Username as sdsdsd")
public void enter_Username_as_sdsdsd() {
	 driver.findElementById("username").sendKeys("sdsdsd");    
}
@Then("Its navigate Same HomePage")
public void its_navigate_Same_HomePage() {
	 driver.getTitle();
	    System.out.println( driver.getTitle());
}

@And("verify error message")
public void verify_error_message() {
   String txt = driver.findElementById("errorDiv").getText();
   System.out.println(txt);
   if(txt.contains("The Following Errors Occurred")) {
	   System.out.println("matched");
   }
	 
		else {System.out.println("not matched");
}

}
}

