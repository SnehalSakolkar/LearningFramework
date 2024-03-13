package PracticingSeleniumwithJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightingTheElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("https://demowebshop.tricentis.com/"); 
		
		WebElement subsribebtn = driver.findElement(By.id("newsletter-subscribe-button"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red';",subsribebtn);
		
	}
}
