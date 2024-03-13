package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void hardAssertion() {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedurl="https://demowebshop.tricentis.com/";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(expectedurl,actualurl,"The url is not same");
		
		String expectedvalue="Practice";
		String actualValue=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		Assert.assertEquals(expectedurl,actualurl,"values are different");
		
//		String expectedRegister="register";
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		String ActualRegister=driver.getCurrentUrl();
//		boolean result=ActualRegister.contains("register");
//		Assert.assertEquals(expectedRegister,result,"It is not Present in Register Page");
		
		Reporter.log("Above conditions are same",true);
		driver.quit();
		
		
		
		
		
	}

}
