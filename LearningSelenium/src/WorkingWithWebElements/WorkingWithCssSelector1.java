package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector1 {

public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[data-attribute='newsletter-email']")).sendKeys("Demo");
		Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(null)));
        
      

}
}