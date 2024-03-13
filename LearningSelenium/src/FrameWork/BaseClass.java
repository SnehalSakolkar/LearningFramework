package FrameWork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import LearningPOM.LoginPage;

public class BaseClass {

	WebDriver driver;
	BasePage basePage;
	LoginPage login;
	
	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			// to launch empty browser--Upcasting
			driver = new ChromeDriver();
			Reporter.log("Browser is launched",true);
		} else if (browserName.equalsIgnoreCase("edge")) {
			// to launch empty browser--Upcasting
			 driver= new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			// to launch empty browser--Upcasting
			 driver= new FirefoxDriver();
		}
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void login() {
		basePage=new BasePage(driver);
		login=new LoginPage(driver);
		basePage.getLoginlink().click();
		login.getEmailTextField().sendKeys("komalgupta121@gmail.com");
		login.getPasswordTextField().sendKeys("Shakuni123.@");
		login.getLoginButton().click();
	}

	@AfterMethod
	public void logout() {
		basePage.getLogoutLink().click();
	}

	@AfterClass
	public void quit() {
		driver.quit();
	}

}
