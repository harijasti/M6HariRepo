package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageVTiger 
{
	@FindBy(xpath="//input[@name=\"user_name\"]")
	private WebElement usernamefield;
	
	@FindBy(xpath ="//input[@name=\"user_password\"]")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement loginbutton;
	
	public LoginPageVTiger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void loginApplication(String username , String password)
	{
		getUsernamefield().sendKeys(username);
		getPasswordtextfield().sendKeys(password);
		getLoginbutton().click();
	}
	
}
