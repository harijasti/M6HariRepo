package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateLeadPlus;
import objectRepo.LeadPage;
import objectRepo.VtigerHomePage;

public class LE_tc_03 extends BaseClass
{

	@Test
	public void le_03() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String fname=eutil.readDataFromExcel("Leads", 5,1 );
		String lname=eutil.readDataFromExcel("Leads", 5,2 );
		String comp=eutil.readDataFromExcel("Leads", 5,3 );
		String title=eutil.readDataFromExcel("Leads", 5,4 );
		String phn=eutil.readDataFromExcel("Leads", 5,5 );
		String mob=eutil.readDataFromExcel("Leads", 5,6 );
		String email=eutil.readDataFromExcel("Leads", 5,7 );
		String noemp=eutil.readDataFromExcel("Leads", 5,8 );
		
		VtigerHomePage vhp=new VtigerHomePage(driver);
		vhp.clickOnLeads();
		
		CreateLeadPlus clp=new CreateLeadPlus(driver);
		clp.clickOnPlus();
		
		LeadPage lp=new LeadPage(driver);
		lp.leadOperations(fname, lname, comp+num,title, phn, mob, email, noemp);
		System.out.println("le - 03");
		Thread.sleep(2000);
	}
}
