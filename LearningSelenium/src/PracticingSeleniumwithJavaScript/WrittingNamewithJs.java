package PracticingSeleniumwithJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrittingNamewithJs {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		WebElement searchBtn = driver.findElement(By.id("small-searchterms"));
		driver.findElement(By.id("gender-female")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.findElement(By.id("FirstName")).sendKeys("Snehal");
		js.executeScript("arguments[0].value='Snehal';", searchBtn);
		Thread.sleep(2000);
	
		
		driver.findElement(By.id("LastName")).sendKeys("Kulkarni");
		js.executeScript("arguments[1].value=''Kulkarni", searchBtn);
		
		
		
	}

}
