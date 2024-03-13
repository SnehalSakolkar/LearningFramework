package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithSpanClass {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/ ");
		
	     driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@class,'window._pxAppId = 'PXgNtTli3A';')"));

}
}