package tc_repository;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;
import genericlibrary.JavaLibrary;
import objectRepo.ContactPageVTiger;
import objectRepo.CreateContactPlus;
import objectRepo.VtigerHomePage;

public class CON_tc_01 extends BaseClass
{
	@Test
	public void conc_01() throws Exception
	{
		JavaLibrary jutil=new JavaLibrary();
		int num=jutil.generateRandomNumber(10000);
		ExcelUtility eutil=new ExcelUtility();
		String fname= eutil.readDataFromExcel("Contacts", 1, 1);
		String lname=eutil.readDataFromExcel("Contacts", 1, 2);
		String comp=eutil.readDataFromExcel("Contacts", 1, 3);
		
		VtigerHomePage hp=new VtigerHomePage(driver);
		hp.clickOnCont();
		
		
		CreateContactPlus ccp=new CreateContactPlus(driver);
		ccp.clickOnPlus();
		
		ContactPageVTiger cpt=new ContactPageVTiger(driver);
		cpt.contactOperation(fname+num, lname, comp);
		System.out.println("co - 01");
		Thread.sleep(2000);
	}
}
