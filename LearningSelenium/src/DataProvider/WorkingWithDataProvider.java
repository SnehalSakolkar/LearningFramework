package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
		@DataProvider(name="TestData")
		public String[][] Provider() throws EncryptedDocumentException, IOException {
			File file=new File("./testData/DemoWebShop.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(fis);
			 Sheet sheet = workbook.getSheet("Data");
			 int noOfRows = sheet.getPhysicalNumberOfRows();
			 int column=sheet.getRow(0).getPhysicalNumberOfCells();
			String data[][]=new String[noOfRows][column];
			System.out.println(noOfRows);
			System.out.println(column);
			//to take the input
			for(int i=0;i<data.length;i++) {
				for(int j=0;j<data[i].length;j++) {
			data[i][j]=sheet.getRow(i).getCell(j).toString();
				}
			}
			return data;
		}
		
		@Test(dataProvider = "TestData")
		public void recieverMethod(String gender,String name,String lastName,String emailId,String pwd,String cnfpwd) {
			System.out.println(gender);
			System.out.println(name);
			System.out.println(emailId);
			System.out.println(pwd);
			System.out.println(cnfpwd);
			System.out.println("--------------------");
		}

}
