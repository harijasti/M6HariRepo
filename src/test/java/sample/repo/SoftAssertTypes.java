package sample.repo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTypes
{
	@Test(priority = 1)
	public void strictLevel()
	{
		String expect="hari";
		String actual="krishna";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actual,expect);
		System.out.println("Assertion pass");
		sf.assertAll();
	}
	
	@Test(priority = 2)
	public void containsLevel()
	{
		String expect="hari";
		String actual="harikrishna";
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(actual.contains(expect));
		System.out.println("contains pass");
		sf.assertAll();
	}
}
