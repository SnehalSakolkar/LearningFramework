package PracticingSeleniumwithJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScrollView {

public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement elements = driver.findElement(By.className("dropbtn"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	    js.executeScript("arguments[0].scrollIntoView(true);",elements);
	    elements.click();
	    driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	}
}
