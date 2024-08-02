package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerHomePage 
{

	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement cont;
	
	@FindBy(xpath="(//table/tbody/tr/td[@class=\"small\"]/table/tbody/tr/td[@class=\"small\"]/img)[1]")
	private WebElement admn;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement so;
	
	public VtigerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLead() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getAdmn() {
		return admn;
	}

	public WebElement getSo() {
		return so;
	}
	
	
	public void clickOnLeads()
	{
		leads.click();
	}
	
	public void clickOnOrg()
	{
		org.click();
	}
	
	public void clickOnCont()
	{
		cont.click();
	}
	
	public void clickOnAdmin()
	{
		admn.click();
	}
	
	public void clickOnSignOut()
	{
		so.click();
	}
	
	public void LogoutOperation(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(admn).perform();
		so.click();
	}
	
	
	
	
	
}
