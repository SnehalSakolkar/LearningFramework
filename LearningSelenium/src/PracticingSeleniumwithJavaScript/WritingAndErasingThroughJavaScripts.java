package PracticingSeleniumwithJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingAndErasingThroughJavaScripts {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchBtn = driver.findElement(By.id("small-searchterms"));
		
		//converting the ref of driver from webdriver to JavaScriptExceutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='I am Learning JavaScript';", searchBtn);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='';", searchBtn);
		
	}
}
