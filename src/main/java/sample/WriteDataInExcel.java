package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericlibrary.IConstantUtility;

public class WriteDataInExcel

{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelpath);
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(7).createCell(8).setCellValue("HariJasti");
		
		FileOutputStream fos=new FileOutputStream(IConstantUtility.excelpath);
		book.write(fos);

		System.out.println("pass");
	}
}
