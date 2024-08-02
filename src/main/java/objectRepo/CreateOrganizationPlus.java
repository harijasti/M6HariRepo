package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPlus
{

	@FindBy(xpath="//img[@alt=\"Create Organization...\"]")
	private WebElement orgplus;
	
	public CreateOrganizationPlus(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgplus() {
		return orgplus;
	}

	public void clickOnOrgPlus()
	{
		orgplus.click();
	}
	
}
