package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MoveToElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
		
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		
		action.moveToElement(computer).perform();
		
           
		WebElement desktop=driver.findElement(By.partialLinkText("Desktops"));
		
		action.moveToElement(computer).perform();
		
		
		String url=driver.getCurrentUrl();
		
		if(url.contains("desktop")) {
			
			System.out.println("We are in desktop page");
		}else {
			System.out.println("We are not in desktop page");
		
		}
		
	}	
}
