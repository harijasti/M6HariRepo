package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage 
{

	@FindBy(xpath="//input[@name=\"firstname\"]")
	private WebElement firstname;

	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement lastname;

	@FindBy(xpath="//input[@name=\"company\"]")
	private WebElement company;

	@FindBy(xpath="//input[@name='designation']")
	private WebElement Title;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	private WebElement phone;

	@FindBy(xpath="//input[@name=\"mobile\"]")
	private WebElement mobile;

	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement emailid;

	@FindBy(xpath="//input[@name=\"noofemployees\"]")
	private WebElement noemployees;

	@FindBy(xpath="//textarea[@name=\"lane\"]")
	private WebElement street;

	@FindBy(xpath="//input[@name=\"pobox\"]")
	private WebElement pobox;

	@FindBy(xpath="//input[@name=\"code\"]")
	private WebElement pcode;

	@FindBy(xpath="//input[@name=\"city\"]")
	private WebElement pcity;

	@FindBy(xpath="//input[@name=\"country\"]")
	private WebElement pcountry;

	@FindBy(xpath="//input[@name=\"state\"]")
	private WebElement pstate;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement savebtn;
	
	public LeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	
	public WebElement getTitle() {
		return Title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getNoemployees() {
		return noemployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPobox() {
		return pobox;
	}

	public WebElement getPcode() {
		return pcode;
	}

	public WebElement getPcity() {
		return pcity;
	}

	public WebElement getPcountry() {
		return pcountry;
	}

	public WebElement getPstate() {
		return pstate;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	
	public void leadOperations(String fname ,String lname , String comp)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		savebtn.click();
	}
	
	public void leadOperations(String fname ,String lname , String comp ,String title, String phn , String mob , String mail ,
			String noemp)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		Title.sendKeys(title);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		emailid.sendKeys(mail);
		noemployees.sendKeys(noemp);
		savebtn.click();
	}
	
	public void leadOperations(String fname ,String lname , String comp ,String title, String phn , String mob , String mail ,
			String noemp , String str , String pbox , String pcd , String cit , String cou , String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		Title.sendKeys(title);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		emailid.sendKeys(mail);
		noemployees.sendKeys(noemp);
		street.sendKeys(str);
		pobox.sendKeys(pbox);
		pcode.sendKeys(pcd);
		pcity.sendKeys(cit);
		pcountry.sendKeys(cou);
		pstate.sendKeys(st);
		savebtn.click();
	}
	
	public void leadOperations(String fname ,String lname , String comp , String str , String pbox , String pcd , 
			String cit , String cou , String st )
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		street.sendKeys(str);
		pobox.sendKeys(pbox);
		pcode.sendKeys(pcd);
		pcity.sendKeys(cit);
		pcountry.sendKeys(cou);
		pstate.sendKeys(st);
		savebtn.click();
	}
	
}
