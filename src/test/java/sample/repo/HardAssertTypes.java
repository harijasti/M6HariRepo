package sample.repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTypes 
{
	@Test(priority = 1)
	public void strictLevel()
	{
		String expect="hari";
		String actual="hari";
		Assert.assertEquals(actual, expect);
		System.out.println("Assertion pass");
	}
	@Test(priority = 2)
	public void containsLevel()
	{
		String expect="8";
		String actual="12345678";
		Assert.assertTrue(actual.contains(expect));
		System.out.println("contains pass");
	}
}
