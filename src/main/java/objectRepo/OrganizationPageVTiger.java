package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPageVTiger
{

	@FindBy(xpath="//input[@name=\"accountname\"]")
	private WebElement orgname;
	
	@FindBy(xpath="//input[@name=\"website\"]")
	private WebElement website;
	
	@FindBy(xpath="//input[@name=\"employees\"]")
	private WebElement employees;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name=\"otherphone\"]")
	private WebElement otherphone;
	
	@FindBy(xpath="//input[@name=\"email1\"]")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name=\"bill_street\"]")
	private WebElement billadd;
	
	@FindBy(xpath="//input[@name=\"bill_city\"]")
	private WebElement billcity;
	
	@FindBy(xpath="//input[@name=\"bill_state\"]")
	private WebElement billstate;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement savebtn;
	
	
	public OrganizationPageVTiger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOtherphone() {
		return otherphone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBilladd() {
		return billadd;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getBillstate() {
		return billstate;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void createOrg(String oname , String web , String empno)
	{
		orgname.sendKeys(oname);
		website.sendKeys(web);
		employees.sendKeys(empno);
		savebtn.click();
	}
	
	public void createOrg(String oname , String web , String empno , String phn , String ophone , String mail)
	{
		orgname.sendKeys(oname);
		website.sendKeys(web);
		employees.sendKeys(empno);
		phone.sendKeys(phn);
		otherphone.sendKeys(ophone);
		email.sendKeys(mail);
		savebtn.click();
	}
	
	public void createOrg(String oname , String web , String badd , String bcity , String bstate)
	{
		orgname.sendKeys(oname);
		website.sendKeys(web);
		billadd.sendKeys(badd);
		billcity.sendKeys(bcity);
		billstate.sendKeys(bstate);
		savebtn.click();
	}
	
	public void createOrg(String oname , String web , String empno , String phn , String ophone , String mail
			, String badd , String bcity , String bstate)
	{
		orgname.sendKeys(oname);
		website.sendKeys(web);
		employees.sendKeys(empno);
		phone.sendKeys(phn);
		otherphone.sendKeys(ophone);
		email.sendKeys(mail);
		billadd.sendKeys(badd);
		billcity.sendKeys(bcity);
		billstate.sendKeys(bstate);
		savebtn.click();
	}
	
	
	
	
}
