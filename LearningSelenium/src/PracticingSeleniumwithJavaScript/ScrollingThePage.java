package PracticingSeleniumwithJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingThePage {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("https://demowebshop.tricentis.com/"); 
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1200);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400);");
		
	}

}
