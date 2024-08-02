package genericlibrary;


import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility
{
	public Actions act=null;
	public Select s=null;
	
	/**
	 * this method helps to maximixe the browser
	 * @param d
	 */
	public void maximization(WebDriver d)
	{
		d.manage().window().maximize();
	}
	
	
	/**
	 * this method helps to solve Synchronization
	 * @param d
	 * @param time
	 */
	public void implicitWait(WebDriver d , int time)
	{
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	/**
	 * this method helps to move cursor to a particular element
	 * @param d
	 * @param ele
	 */
	public void movingTowardsAnElement(WebDriver d , WebElement ele)
	{
		act=new Actions(d);
		act.moveToElement(ele).perform();
	}
	
	
	/**
	 * this method helps to drag the particular element
	 * @param d
	 * @param ele
	 * @param x
	 * @param y
	 */
	public void dragPointer(WebDriver d , WebElement ele , int x , int y)
	{
		act=new Actions(d);
		act.dragAndDropBy(ele, x, y).perform();
	}
	
	
	/**
	 * this method helps to do clickAndHold operation
	 * @param d
	 * @param ele
	 */
	public void clickAndHoldAnElement(WebDriver d,WebElement ele)
	{
		act=new Actions(d);
		act.clickAndHold(ele).perform();
	}
	
	/**
	 * this method helps to release a particuar element
	 * @param d
	 * @param ele
	 */
	public void releaseAnElement(WebDriver d,WebElement ele)
	{
		act=new Actions(d);
		act.release(ele).perform();
	}
	
	/**
	 * this method helps to select option from Dropdown by index
	 * @param d
	 * @param ele
	 * @param index
	 */
	public void selectElementWithIndex(WebDriver d,WebElement ele , int index)
	{
		s=new Select(ele);
		s.selectByIndex(index);
	}
	
	
	/**
	 * this method helps to select option from Dropdown by value attribute
	 * @param d
	 * @param ele
	 * @param value
	 */
	public void selectElementWithValueAtt(WebDriver d,WebElement ele , String value)
	{
		s=new Select(ele);
		s.selectByValue(value);
	}
	
	/**
	 * this method helps to select option from Dropdown by visible text
	 * @param d
	 * @param ele
	 * @param text
	 */
	public void selectElementWithVisibleText(WebDriver d,WebElement ele , String text)
	{
		s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	/**
	 * this method helps to get all options from Dropdown
	 * @param d
	 * @param ele
	 * @return
	 */
	public List<WebElement> getAllFromDropDown(WebDriver d,WebElement ele)
	{
		s=new Select(ele);
		List<WebElement> options=s.getOptions();
		return options;
	}
	
	/**
	 * this method helps to get all selected options from Dropdown
	 * @param d
	 * @param ele
	 * @return
	 */
	public List<WebElement> getAllSelectedOptionsFromDropDown(WebDriver d,WebElement ele)
	{
		s=new Select(ele);
		List<WebElement> alloptions=s.getAllSelectedOptions();
		return alloptions;
	}
	
	/**
	 * this method helps to Deselect option from Dropdown by index
	 * @param d
	 * @param ele
	 * @param index
	 */
	public void deselectElementWithIndex(WebDriver d,WebElement ele , int index)
	{
		s=new Select(ele);
		s.deselectByIndex(index);
	}
	
	/**
	 * this method helps to Deselect option from Dropdown by value attribute
	 * @param d
	 * @param ele
	 * @param value
	 */
	public void deselectElementWithValueAtt(WebDriver d,WebElement ele , String value)
	{
		s=new Select(ele);
		s.deselectByValue(value);
	}
	
	/**
	 * this method helps to select option from Dropdown by visible text
	 * @param d
	 * @param ele
	 * @param text
	 */
	public void deselectElementWithVisibleText(WebDriver d,WebElement ele , String text)
	{
		s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	/**
	 * this method helps to Deselect all options from Dropdown
	 * @param d
	 * @param ele
	 */
	public void deselectAllOptions(WebDriver d,WebElement ele )
	{
		s=new Select(ele);
		s.deselectAll();
	}
	
	/**
	 * this method helps to accept Alert Popup
	 * @param d
	 */
	public void toAcceptAlertPopup(WebDriver d)
	{
		Alert alt=d.switchTo().alert();
		alt.accept();
	}
	
	/**
	 * this method helps to dismiss Alert Popup
	 * @param d
	 */
	public void toDismissAlertPopup(WebDriver d)
	{
		Alert alt=d.switchTo().alert();
		alt.dismiss();
	}
	
	/**
	 * this method helps to pass message to Alert Popup
	 * @param d
	 * @param msg
	 */
	public void toPassAlertMsg(WebDriver d ,String msg)
	{
		Alert alt=d.switchTo().alert();
		alt.sendKeys(msg);
	}
	
	/**
	 * this method helps to fetch Alert message 
	 * @param d
	 * @return
	 */
	public String toFetchAlertMsg(WebDriver d)
	{
		Alert alt=d.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	
	/**
	 * this method helps to do operation with javascript
	 * @param d
	 * @param value
	 */
	public void operationsWithJs(WebDriver d ,String value)
	{
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript(value);
	}
	
	/**
	 * this method helps to capture the Screenshot
	 * @param d
	 * @param path
	 * @throws Exception
	 */
	public void CaptureScreenshot(WebDriver d ,String path) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		Files.copy(src, dest);
	}
	
	/**
	 * this method helps us when fails to click an element
	 * @param d
	 * @param ele
	 * @param time
	 * @throws Exception
	 */
	public void ifElementClickFails(WebDriver d ,WebElement ele,int time) throws Exception
	{
		int count=0;
		int reclickcount=5;
		while(count<=reclickcount)
		{
			ele.click();
			Thread.sleep(time);
			break;
		}
	}
	
	/**
	 * this method helps to handle Window Popup
	 * @param d
	 */
	public void windowPopupHandle(WebDriver d )
	{
		String prtwin=d.getWindowHandle();
		Set<String> allwindow=d.getWindowHandles();
		Iterator<String> itr=allwindow.iterator();
		while(itr.hasNext())
		{
			String values=itr.next();
			String title=d.switchTo().window(values).getTitle();
			
			if(title.contains(values))
			{
				break;
			}
		}
	}
	
	
}
