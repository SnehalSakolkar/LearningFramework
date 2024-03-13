package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnElectronics {
	
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
		
		WebElement Electronics = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		
		action.moveToElement(Electronics).perform();
		
		
      WebElement Cellphones=driver.findElement(By.partialLinkText("Cell phones"));
      
      action.moveToElement(Cellphones).click().perform();
		
	   String url=driver.getCurrentUrl();
		
		if(url.contains("cell")) {
			
			System.out.println("We are in Cellphone page");
		}else {
			System.out.println("We are not in Cellphone page");
		
		}
		
	}	


}
