package PracticingSeleniumwithJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoGivenElement {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://doodles.google/search/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement target = driver.findElement(By.xpath("(//div[@class='doodle-card-wrapper'])[11]"));
		js.executeScript("arguments[0].scrollIntoView(true);",target);
	}

}
