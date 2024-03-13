package PracticingSeleniumwithJavaScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testData/testData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("data");
		  String name = sheet.getRow(0).getCell(1).toString();
		  System.out.println(name);
		  String pwd=sheet.getRow(1).getCell(4).toString();
		  System.out.println(pwd);
		  
		  //fetching the date from excel form
		  LocalDateTime date = sheet.getRow(4).getCell(2).getLocalDateTimeCellValue();
		  String month=date.getMonth().toString();
		  int day=date.getDayOfMonth();
		  int year=date.getYear();
		  System.out.println(month);
		  System.out.println(day);
		  System.out.println(year);
	}

}
