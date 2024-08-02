package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateOrganizationPlus;
import objectRepo.OrganizationPageVTiger;
import objectRepo.VtigerHomePage;

public class ORG_tc_02 extends BaseClass
{

	@Test
	public void org_02() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String orgname=eutil.readDataFromExcel("Organization", 5, 1);
		String website=eutil.readDataFromExcel("Organization", 5, 2);
		String emp=eutil.readDataFromExcel("Organization", 5, 3);	
		String phn=eutil.readDataFromExcel("Organization", 5, 4);
		String othphn=eutil.readDataFromExcel("Organization", 5, 5);
		String email=eutil.readDataFromExcel("Organization", 5, 6);
		
		VtigerHomePage hp=new VtigerHomePage(driver);
		hp.clickOnOrg();
		
		CreateOrganizationPlus co=new CreateOrganizationPlus(driver);
		co.clickOnOrgPlus();
		
		OrganizationPageVTiger op=new OrganizationPageVTiger(driver);
		op.createOrg(orgname+num, website,emp, phn, othphn, email);
		System.out.println("org - 02");
		Thread.sleep(2000);
		
	}
}
