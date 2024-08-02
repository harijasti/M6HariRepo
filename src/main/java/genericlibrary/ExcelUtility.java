package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 *  this is a generic class for read & write data in excel
 */
public class ExcelUtility
{

	/**
	 *  this is a generic method for read data in excel
	 * @param sheetname
	 * @param rownum
	 * @author Hari
	 * @param cellnum
	 * @return
	 * @throws Exception
	 */
	public String readDataFromExcel(String sheetname , int rownum , int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		
		DataFormatter format=new DataFormatter();
		
		Row r=sh.getRow(rownum);
		Cell c=r.getCell(cellnum);
		
		String val=format.formatCellValue(c);
		return val;
	}
	
	/**
	 * this is a generic method for write data in excel
	 * @param shname
	 * @author Hari
	 * @param rnum
	 * @param cnum
	 * @param input
	 * @throws Exception
	 */
	public void writeDataInExcel(String shname , int rnum , int cnum , String input) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh= book.getSheet(shname);
		
		sh.createRow(rnum).createCell(cnum).setCellValue(input);
		
		DataFormatter df=new DataFormatter();
		FileOutputStream fos=new FileOutputStream(IConstantUtility.excelpath);
		book.write(fos);
	}
	

}
