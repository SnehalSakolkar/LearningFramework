package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSolving {
	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		WebElement element=driver.findElement(By.id("FirstName"));
		element.sendKeys("Snehal");
		element.sendKeys(Keys.CONTROL+"a");
		element.sendKeys(Keys.CONTROL+"c");
	    Thread.sleep(2000);
	    driver.findElement(By.id("LasrName")).sendKeys(Keys.CONTROL+"v");
	    
	     
	}
		

}
