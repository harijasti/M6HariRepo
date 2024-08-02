package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateLeadPlus;
import objectRepo.LeadPage;
import objectRepo.VtigerHomePage;

public class LE_tc_01 extends BaseClass
{

	@Test
	public void le_01() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String fname=eutil.readDataFromExcel("Leads", 2,1 );
		String lname=eutil.readDataFromExcel("Leads", 2,2 );
		String comp=eutil.readDataFromExcel("Leads", 2,3 );
	
		VtigerHomePage vhp=new VtigerHomePage(driver);
		vhp.clickOnLeads();
		
		CreateLeadPlus clp=new CreateLeadPlus(driver);
		clp.clickOnPlus();
		
		LeadPage lp=new LeadPage(driver);
		lp.leadOperations(fname, lname, comp+num);
		System.out.println("le - 01");
		Thread.sleep(2000);
	}
}
