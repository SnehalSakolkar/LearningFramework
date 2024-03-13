package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAssignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		action.moveToElement(home).perform();
		 WebElement livingRoom = driver.findElement(By.partialLinkText("livin"));
		 action.moveToElement(livingRoom).perform();
		 WebElement tvunits = driver.findElement(By.partialLinkText("Tv"));
		action.moveToElement(tvunits).perform();
		String url = driver.getCurrentUrl();
		 if(url.contains("tv-units")) {
			 
			System.out.println("We are in TvUnits page");
		}else {
			System.out.println("We are not in TvUnits page");
		
		}
	driver.close();	
	
}
}