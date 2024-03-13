package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		Actions action=new Actions(driver);
		WebElement add=driver.findElement(By.id("add"));
		action.moveToElement(add).perform();
		for(int i=1;i<=4;i++) {
			action.doubleClick().perform();
			Thread.sleep(2000);
		}
		WebElement minus=driver.findElement(By.id("minus"));
		action.doubleClick(minus).perform();
	}

}
