package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClick {
	
	public static void main(String[] args) throws InterruptedException {
		//input[@type='radio']
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(rightClickButton).perform();
		action.contextClick().perform();
		WebElement editButton = driver.findElement(By.xpath("//span[text()='Edit']"));
		editButton.click();
}
		
	}

