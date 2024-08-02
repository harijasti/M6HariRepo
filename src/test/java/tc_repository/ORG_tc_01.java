package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateOrganizationPlus;
import objectRepo.OrganizationPageVTiger;
import objectRepo.VtigerHomePage;

public class ORG_tc_01 extends BaseClass
{

	@Test
	public void org_01() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String orgname=eutil.readDataFromExcel("Organization", 2, 1);
		String website=eutil.readDataFromExcel("Organization", 2, 2);
		String emp=eutil.readDataFromExcel("Organization", 2, 3);
		
		VtigerHomePage hp=new VtigerHomePage(driver);
		hp.clickOnOrg();
		
		CreateOrganizationPlus co=new CreateOrganizationPlus(driver);
		co.clickOnOrgPlus();
		
		OrganizationPageVTiger op=new OrganizationPageVTiger(driver);
		op.createOrg(orgname+num, website, emp);
		System.out.println("org - 01");
		Thread.sleep(3000);
	}
}
