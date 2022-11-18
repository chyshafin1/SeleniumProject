package Date;


import org.openqa.selenium.chrome.ChromeDriver;

public class date {

	public static void main(String[] args) {
			
		String month="November 2022";
		String day="21";
		
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cheapoair.com/"); 
		driver.findElementById("cal0").click();
		
		while(true) {
			  String text = driver.findElementByClassName("calendar__month").getText();
			  System.out.println(text);
			
		if(text.equals(month)) {
			break;
		}else {
				driver.findElementByXPath("//a[@class='calendar-nav__next icon  rightNav']").click();
			}
	}
		driver.findElementByXPath("//a[@id='closeCalendar']").click();
		driver.close(); 
}

}

	

