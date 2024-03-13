package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\n");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.id("register-button")).click();
	
	
		System.out.println(driver.findElement(By.xpath("//span[@class='field-validation-error")).getText());
				driver.quit();
}
}