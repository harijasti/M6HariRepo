package sample.repo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Test_Case_1 
{

	@Test(priority=1,invocationCount=0)
	public void createUser()
	{
		System.out.println("HARI");
	}
	
//	@Ignore
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("mu");
	}
	
	@Test(priority=1 , enabled = false)
	public void deleteUser()
	{
		System.out.println("du");
	}
	
}
