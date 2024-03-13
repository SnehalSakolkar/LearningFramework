package WorkingWithPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21 {

public static void main(String []args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		File file=new File("./testData/testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("data");
		
		  String gender = sheet.getRow(0).getCell(0).toString();
		  String name = sheet.getRow(0).getCell(1).toString();
		  String lastname = sheet.getRow(0).getCell(2).toString();
		  String mailid = sheet.getRow(0).getCell(3).toString();
		  String pwd = sheet.getRow(0).getCell(4).toString();
		  
		  driver.findElement(By.xpath("//a[text()='Register']")).click();
			
if(gender.equalsIgnoreCase("Male")) {
	
	driver.findElement(By.id("gender-male")).click();
}else {
	driver.findElement(By.id("gender-female")).click();
	
	
}
		  
		    driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Snehal");
	     	driver.findElement(By.id("LastName")).sendKeys("Kulkarni");
			driver.findElement(By.id("Email")).sendKeys("snehalsakolkar9@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Snehu@Germany");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Snehu@Germany");
			driver.findElement(By.id("register-button")).click();
			
	}

}
