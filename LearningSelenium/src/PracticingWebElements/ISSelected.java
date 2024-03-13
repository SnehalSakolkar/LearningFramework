package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISSelected {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		
		WebElement element1 = driver.findElement(By.id("RememberMe"));
		
		System.out.println(element1.isSelected());
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(2000);
		System.out.println(element1.isSelected());
		driver.quit();
}
}
