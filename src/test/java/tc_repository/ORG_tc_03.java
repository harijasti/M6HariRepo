package tc_repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateOrganizationPlus;
import objectRepo.OrganizationPageVTiger;
import objectRepo.VtigerHomePage;

public class ORG_tc_03 extends BaseClass
{
	
	@Test
	public void org_03() throws Exception
	{
		JavaLibrary  jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String orgname=eutil.readDataFromExcel("Organization", 8, 1);
		String website=eutil.readDataFromExcel("Organization", 8, 2);
		String billadd=eutil.readDataFromExcel("Organization", 8, 3);	
		String billcity=eutil.readDataFromExcel("Organization", 8, 4);
		String state=eutil.readDataFromExcel("Organization", 8, 5);
		
		VtigerHomePage hp=new VtigerHomePage(driver);
		hp.clickOnOrg();
		
		CreateOrganizationPlus co=new CreateOrganizationPlus(driver);
		co.clickOnOrgPlus();
		
		OrganizationPageVTiger op=new OrganizationPageVTiger(driver);
		op.createOrg(orgname+num, website, billadd, billcity, state);
		System.out.println("org - 03");
		Thread.sleep(2000);
	}
}
