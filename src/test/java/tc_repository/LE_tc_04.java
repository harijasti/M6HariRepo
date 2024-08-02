package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateLeadPlus;
import objectRepo.LeadPage;
import objectRepo.VtigerHomePage;

public class LE_tc_04 extends BaseClass
{

	@Test
	public void le_04() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String fname=eutil.readDataFromExcel("Leads", 5,1 );
		String lname=eutil.readDataFromExcel("Leads", 5,2 );
		String comp=eutil.readDataFromExcel("Leads", 5,3 );
		String street=eutil.readDataFromExcel("Leads", 5,4 );
		String pobox=eutil.readDataFromExcel("Leads", 5,5 );
		String pocode=eutil.readDataFromExcel("Leads", 5,6 );
		String city=eutil.readDataFromExcel("Leads", 5,7 );
		String country=eutil.readDataFromExcel("Leads", 5,8 );
		String state=eutil.readDataFromExcel("Leads", 5,9 );
		

		VtigerHomePage vhp=new VtigerHomePage(driver);
		vhp.clickOnLeads();
		
		CreateLeadPlus clp=new CreateLeadPlus(driver);
		clp.clickOnPlus();
		
		LeadPage lp=new LeadPage(driver);
		lp.leadOperations(fname+num, lname, comp+num, street, pobox, pocode, city, country, state);
		System.out.println("le - 04");
		Thread.sleep(2000);
	}
}
