package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VTigerLeads
{

	public static void main(String[] args) throws Exception
		{
			Select s=null;
			WebDriver d=  new ChromeDriver();
			d.get("http://localhost:8888/index.php?action=index&module=Home");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin" , Keys.TAB , "root" , Keys.ENTER);
			
			d.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//img[@title=\"Create Lead...\"]")).click();
			Thread.sleep(2000);
			WebElement ele=d.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
			s=new Select(ele);
			s.selectByIndex(1);
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("hari");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("jasti");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("tcs");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("1234567899");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9876543211");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("hari123@gmail.com");
			

		}
	
	
}
