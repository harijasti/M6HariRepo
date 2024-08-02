package genericlibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility
{

	public String getDataFromProperties(String data) throws Exception 
	{
		    FileInputStream fis=new FileInputStream(IConstantUtility.propertiespath);
		    Properties pobj=new Properties();			
			pobj.load(fis);		
			
			String info=pobj.getProperty(data);
			return info;
			
	}
	
//	public static void main(String[] args) throws Exception {
//		PropertiesUtility pu=new PropertiesUtility();
//		System.out.println(pu.getDataFromProperties("url"));
//	}
		
}
