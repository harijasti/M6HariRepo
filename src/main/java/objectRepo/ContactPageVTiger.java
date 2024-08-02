package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageVTiger 
{
	@FindBy(xpath="//input[@name=\"firstname\"]")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name=\"title\"]")
	private WebElement title;
	
	@FindBy(xpath="(//input[@value=\"  Save  \"])[2]")
	private WebElement savebtn;
	
	public ContactPageVTiger(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getFirstname(){
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getTitle() {
		return title;
	}
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}

	/**
	 * this is a business library of contact opertaion
	 * @param fname
	 * @param lname
	 * @param til
	 */
	public void contactOperation(String fname , String lname , String til)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		title.sendKeys(til);
		savebtn.click();
	}
	
}
