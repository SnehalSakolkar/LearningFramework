package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingHeightandWidth {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		WebElement element1 = driver.findElement(By.id("FirstName"));
		WebElement element2 = driver.findElement(By.id("LastName"));
		
		if(element1.getSize().getHeight()==element2.getSize().getHeight()&& element1.getSize().getWidth()==element2.getSize().getWidth()) {
			
			System.out.println("Height and Width are same");
		}else {
			
			System.out.println("Height and Width are same");
		}

}
}
