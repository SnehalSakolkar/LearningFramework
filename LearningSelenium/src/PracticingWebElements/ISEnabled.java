package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISEnabled {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		System.out.println(driver.findElement(By.xpath("//button[text()='Button2']")).isEnabled());

		System.out.println(driver.findElement(By.xpath("//button[text()='Button1']")).isEnabled());

driver.quit();
} 
	
	
}

