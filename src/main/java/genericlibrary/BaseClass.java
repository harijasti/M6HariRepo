package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import objectRepo.LoginPageVTiger;
import objectRepo.VtigerHomePage;

public class BaseClass
{
	public static WebDriver driver=null;
	public PropertiesUtility putil=null;
	public SeleniumUtility sutil=new SeleniumUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void createDbConnection()
	{
		System.out.println("creating DataBase successfully");
	}
	

	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception
	{
		putil=new PropertiesUtility();
		String URL=putil.getDataFromProperties("url");
		driver=new ChromeDriver();
		sutil.implicitWait(driver, 10);
		sutil.maximization(driver);
		driver.get(URL);		
		System.out.println("launching browser successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
		putil=new PropertiesUtility();
		String Username=putil.getDataFromProperties("username");
		String Password=putil.getDataFromProperties("password");
		LoginPageVTiger lpt=new LoginPageVTiger(driver);
		lpt.loginApplication(Username, Password);
		System.out.println("login successfull");
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void logoutOperation()
	{
		VtigerHomePage hp=new VtigerHomePage(driver);
		hp.LogoutOperation(driver);
		System.out.println("logout successfull");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver=new ChromeDriver();
		driver.close();
		System.out.println("browser closed successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDbConnection()
	{
		System.out.println("db closed successfully");
	}
}
