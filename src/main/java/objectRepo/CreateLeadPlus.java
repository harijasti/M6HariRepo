package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPlus
{

	@FindBy(xpath="//img[@title=\"Create Lead...\"]")
	private WebElement leadplus;
	
	public CreateLeadPlus(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeadplus() {
		return leadplus;
	}
	
	public void clickOnPlus()
	{
		leadplus.click();
	}
}
