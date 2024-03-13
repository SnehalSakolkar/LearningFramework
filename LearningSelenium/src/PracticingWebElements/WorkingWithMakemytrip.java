package PracticingWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMakemytrip {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).sendKeys("Delhi");
		List<WebElement> elements = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li"));
		
		for(WebElement element:elements) {
			if(element.getText().contains("Delhi")) {
				element.click();
				break;
			}
		}
		driver.findElement(By.id("toCity")).sendKeys("Mumbai");
		List<WebElement> toElements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(WebElement element:toElements) {
               if(element.getText().contains("Mumbai")) {
            	   element.click();
            	   break;
               }
		}
		driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[9]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
}
	}