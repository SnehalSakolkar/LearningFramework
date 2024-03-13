package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement box1=driver.findElement(By.id("box1"));
		WebElement norway=driver.findElement(By.id("box101"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(box1, norway).perform();
		
		WebElement seoul=driver.findElement(By.id("box5"));
		WebElement southKorea=driver.findElement(By.id("box105"));
		
		action.dragAndDrop(seoul, southKorea).perform();
		WebElement washingTon=driver.findElement(By.id("box3"));
		WebElement unitedStates=driver.findElement(By.id("box103"));
		
		action.clickAndHold(washingTon).moveToElement(unitedStates).release().perform();
}
	}
		


