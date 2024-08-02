package sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

import genericlibrary.ExcelUtility;

public class ReadingDataFromExcel
{
    public static void main(String[] args) throws Exception
    {
		FileInputStream fis=new FileInputStream("C:\\Users\\Shalini\\OneDrive\\Documents\\ModulesofVtiger.xlsx");

		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sample");
		Row r=sh.getRow(2);
		String value=r.getCell(3).getStringCellValue();
		System.out.println(value);
	}
//	public static void main(String[] args) throws Exception {
//		ExcelUtility eu=new ExcelUtility();
//		System.out.println(eu.readDataFromExcel("Contacts", 1, 3));
//	}
    
}
