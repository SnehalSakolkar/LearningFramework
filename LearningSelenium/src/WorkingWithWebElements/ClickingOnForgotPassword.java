package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnForgotPassword {
	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[text()='Register']")).sendKeys(Keys.CONTROL,Keys.ENTER);
		
		
	}
		

}
