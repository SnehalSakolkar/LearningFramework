package DataProvider;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	
	@Test
	public void SoftAssertion() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		SoftAssert softassert=new SoftAssert();
		
		String expectedurl="https://demowebshop.tricentis.com/";
		String actualurl=driver.getCurrentUrl();
	    softassert.assertEquals(expectedurl,actualurl,"The url is not same");
		
		String expectedvalue="Practice";
		driver.findElement(By.id("small-searchterms")).sendKeys("Practice");
		String actualValue=driver.findElement(By.id("small-searchterms")).getAttribute("value");
        softassert.assertEquals(expectedvalue,actualValue,"The values are not same");
		
		String expectedRegister="register";
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
//		String ActualRegister=driver.getCurrentUrl();
//		boolean result=ActualRegister.contains("register");
		softassert.assertEquals(expectedRegister,driver.getCurrentUrl().contains("register"),"It is not Present in Register Page");
		
		Reporter.log("Above conditions are same",true);
		driver.quit();
		
		softassert.assertAll();
		
	}


}
