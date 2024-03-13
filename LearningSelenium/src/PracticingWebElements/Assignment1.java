package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		WebElement element1 = driver.findElement(By.id("Email"));
		WebElement element2 = driver.findElement(By.id("Password"));
		
		int x1=element1.getLocation().getX();
		int x2=element1.getLocation().getX();
		
		int w1=x1+element1.getRect().getWidth();
		int w2=x2+element2.getRect().getWidth();
		
		
		int y1=x1+element1.getRect().getX();
		int y2=x2+element2.getRect().getX();
		
		int h1=y1+element1.getRect().getHeight();
		int h2=y2+element2.getRect().getHeight();
		
		
		
		
		if(x1==x2 && w1==w2 && h1==h2) {
			
			System.out.println("The text boxes are alligned in same axis Height and Width ");
		}else {
			
			System.out.println("The elements are not alligned in same axis Height and Width");
		
		}
		driver.close();

    }
		}


