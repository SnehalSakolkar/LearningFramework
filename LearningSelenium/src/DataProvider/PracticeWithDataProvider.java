package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeWithDataProvider {
	
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
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Register")).click();
	
	if(gender.equalsIgnoreCase("male")) {
		driver.findElement(By.id("gender-male")).click();
	}else {
		driver.findElement(By.id("gender-female")).click();
	}
	driver.findElement(By.id("FirstName")).sendKeys(name);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(emailId);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cnfpwd);
	driver.findElement(By.id("register-button")).click();
	}


}
