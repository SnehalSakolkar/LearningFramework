package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRegisterPage {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Snehal");
		driver.findElement(By.id("LastName")).sendKeys("Kulkarni");
		driver.findElement(By.id("Email")).sendKeys("Snehalsakolkar9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Snehu@Germany");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Snehu@Germany");
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
