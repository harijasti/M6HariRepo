package tc_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.CreateLeadPlus;
import objectRepo.LeadPage;
import objectRepo.VtigerHomePage;

public class LE_tc_02 extends BaseClass
{

	@Test
	public void le_02() throws Exception
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
		String street=eutil.readDataFromExcel("Leads", 5,9 );
		String pobox=eutil.readDataFromExcel("Leads", 5,10 );
		String pocode=eutil.readDataFromExcel("Leads", 5,11 );
		String city=eutil.readDataFromExcel("Leads", 5,12 );
		String country=eutil.readDataFromExcel("Leads", 5,13 );
		String state=eutil.readDataFromExcel("Leads", 5,14 );
			
		
	
		VtigerHomePage vhp=new VtigerHomePage(driver);
		vhp.clickOnLeads();
		
		CreateLeadPlus clp=new CreateLeadPlus(driver);
		clp.clickOnPlus();
		
		LeadPage lp=new LeadPage(driver);
		lp.leadOperations(fname, lname, comp+num,title, phn, mob, email, noemp, street, pobox, pocode, city, country, state);
		System.out.println("le - 02");
		Thread.sleep(2000);
	}
}
