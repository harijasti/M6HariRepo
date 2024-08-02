package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateOrganizationPlus;
import objectRepo.OrganizationPageVTiger;
import objectRepo.VtigerHomePage;

public class ORG_tc_04 extends BaseClass
{

	@Test
	public void org_04() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String orgname=eutil.readDataFromExcel("Organization", 11, 1);
		String website=eutil.readDataFromExcel("Organization", 11, 2);
		String emp=eutil.readDataFromExcel("Organization", 11, 3);
		String phn=eutil.readDataFromExcel("Organization", 11, 4);
		String othphn=eutil.readDataFromExcel("Organization", 11, 5);
		String email=eutil.readDataFromExcel("Organization", 11, 6);
		String billadd=eutil.readDataFromExcel("Organization", 11, 7);	
		String billcity=eutil.readDataFromExcel("Organization", 11, 8);
		String billstate=eutil.readDataFromExcel("Organization", 11, 9);
		
		VtigerHomePage hp=new VtigerHomePage(driver);
		hp.clickOnOrg();
		
		CreateOrganizationPlus co=new CreateOrganizationPlus(driver);
		co.clickOnOrgPlus();
		
		OrganizationPageVTiger op=new OrganizationPageVTiger(driver);
		op.createOrg(orgname+num, website, emp,email, phn, othphn, billadd, billcity, billstate);
		System.out.println("org - 04");
		Thread.sleep(2000);
	}
}
