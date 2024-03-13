package WorkingwithActionClass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWishlist {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		
   List <WebElement> elements = driver.findElements(By.xpath("//div[@class='header-links']//ul//li//a"));
		
		for(WebElement element:elements) {
			element.sendKeys(Keys.SHIFT,Keys.ENTER);
		
			
		}
     Set<String> windowsId=driver.getWindowHandles();
		
		for(String windowId:windowsId) {
			
	if(driver.switchTo().window(windowId).getTitle().contains("Wishlist")) {
		driver.switchTo().window(windowId);
		
		
		Thread.sleep(2000);
		driver.close(); 	
		driver.quit(); 
      break;
	
	}

		}
	}
}

