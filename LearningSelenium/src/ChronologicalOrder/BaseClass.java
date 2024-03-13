package ChronologicalOrder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	

		public WebDriver driver;
		String emailId="er.pallavi207@gmail.com";
		String password="Password@123";
		
		@BeforeSuite
		public void dataBaseStart() {
		Reporter.log("Database connection is started",true);
		Reporter.log("Extend report formation",true);	
		}
		
		@AfterSuite
		public void dataeBaseClosed() {
			Reporter.log("Database connection is stopped",true);
			Reporter.log("Extend report formation end",true);
		}
		
		@BeforeTest
		public void browserSetUp() {
		//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("user is able to open the empty browser",true);
			driver.manage().window().maximize();
			Reporter.log("user is able to maximize the  browser",true);
			driver.get("https://demowebshop.tricentis.com/");
			
		}
		
		@AfterTest
		public void tearDownBroswer() {
			driver.quit();
			Reporter.log("user is able to close the browser",true);
		}
		
		@BeforeMethod
		public void login() {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.id("Email")).sendKeys(emailId);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Reporter.log("user is able to login",true);
		}
		
		@AfterMethod
		public void logout() {
			driver.findElement(By.partialLinkText("Log out")).click();
			Reporter.log("user is able to logout",true);
		}
		
		
		
	}



