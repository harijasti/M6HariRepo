package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPlus
{

	@FindBy(xpath="//img[@alt=\"Create Contact...\"]")
	private WebElement conplus;
	
	public CreateContactPlus(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getConplus() {
		return conplus;
	}
	
	public void clickOnPlus()
	{
		conplus.click();
	}
}
