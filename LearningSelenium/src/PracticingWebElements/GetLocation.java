package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		WebElement element1 = driver.findElement(By.id("Email"));
		WebElement element2 = driver.findElement(By.id("Password"));
		
		int x1=element1.getLocation().getX();
		int x2=element1.getLocation().getX();
		
		if(x1==x2 && (x1+element1.getSize().getWidth())==(x2+element2.getSize().getWidth())){
			
			System.out.println("The elements are alligned in same co-ordinates ");
		}else {
			
			System.out.println("The elements are not alligned in same co-ordinates");
		}
		}
		
		

}

