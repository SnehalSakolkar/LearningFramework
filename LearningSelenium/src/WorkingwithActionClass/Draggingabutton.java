package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggingabutton {
	
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action=new Actions(driver);
		WebElement stockholm=driver.findElement(By.id("box2"));
		WebElement sweden=driver.findElement(By.id("box102"));
		
		WebElement mainbox=driver.findElement(By.id("capitals"));
		
		action.dragAndDrop(stockholm, sweden).perform();
		Thread.sleep(2000);
		action.dragAndDrop(stockholm,mainbox ).perform();

		
	}

}
