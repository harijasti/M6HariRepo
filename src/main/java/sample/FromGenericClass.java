package sample;

import genericlibrary.ExcelUtility;

public class FromGenericClass
{
	public static void main(String[] args) throws Exception
	{
		ExcelUtility r=new ExcelUtility();
		String value=r.readDataFromExcel("Sample", 0, 0);
		System.out.println(value);
	}
}
