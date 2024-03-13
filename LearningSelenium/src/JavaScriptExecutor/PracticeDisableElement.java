package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDisableElement {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 

		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 

		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement disableElement = driver.findElement(By.id("tb2"));
		
		js.executeScript("arguments[0].value='Handling disable element';",disableElement);


}

}
