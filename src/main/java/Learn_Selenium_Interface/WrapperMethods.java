package Learn_Selenium_Interface;

public interface WrapperMethods {
	
	public void login(String url);
	public void enterById(String locatorValue,String Data);
	public void enterByName(String locatorValue,String Data);
	public void enterByClass(String locatorValue,String Data);
	public void enterByXpath(String locatorValue,String Data);
	public void enterByCSS(String locatorValue,String Data);
	
	
	public void clickById(String lacotorValue);
	public void clickByName(String lacotorValue);
	public void clickByClass(String lacotorValue);
	public void clickByXpath(String lacotorValue);
	public void clickByCSS(String lacotorValue);
	public void clickByLinkText(String lacotorValue);
	
	public void chooseByIdText(String lacotorValue,String Data);
	
	public void closeBrowser();
}
