package PracticingWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningMulitiplePage {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List <WebElement> elements = driver.findElements(By.xpath("//div[@class='header-links']//ul//li//a"));
		
		for(WebElement element:elements) {
			element.sendKeys(Keys.SHIFT,Keys.ENTER);
		
			
		}
		//for printing all the text
		for(WebElement element:elements) {
			System.out.println(element.getText());

			
		}
		
	}
	
	

}
