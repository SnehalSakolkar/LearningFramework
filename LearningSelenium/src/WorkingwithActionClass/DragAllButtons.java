package WorkingwithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAllButtons {
	
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action=new Actions(driver);
		
		WebElement Oslo=driver.findElement(By.id("box1"));
		WebElement stockHolm=driver.findElement(By.id("box2"));
		WebElement washingTon=driver.findElement(By.id("box3"));
		
		WebElement Copenhagen=driver.findElement(By.id("box4"));
		
		WebElement seoul=driver.findElement(By.id("box5"));
		WebElement Rome =driver.findElement(By.id("box6"));
		WebElement Madrid=driver.findElement(By.id("box7"));
		       
		
		WebElement norway=driver.findElement(By.id("box101"));
		WebElement sweden=driver.findElement(By.id("box102"));
		WebElement unitedStates=driver.findElement(By.id("box103"));
		WebElement Denmark=driver.findElement(By.id("box104"));
		WebElement southKorea=driver.findElement(By.id("box105"));
		WebElement Italy=driver.findElement(By.id("box106"));
		WebElement Spain=driver.findElement(By.id("box107"));
		
		
		action.dragAndDrop(Oslo, norway).perform();
		Thread.sleep(2000);
		

		action.dragAndDrop(stockHolm, sweden).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(washingTon, unitedStates).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(Copenhagen, Denmark).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(seoul, southKorea).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(Rome, Italy).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(Madrid, Spain).perform();
		Thread.sleep(2000);
		
		WebElement mainbox=driver.findElement(By.id("capitals"));
		
		action.clickAndHold(Oslo).moveToElement(mainbox).release().perform();
		action.clickAndHold(stockHolm).moveToElement(mainbox).release().perform();
		action.clickAndHold(Copenhagen).moveToElement(mainbox).release().perform();
		action.clickAndHold(seoul).moveToElement(mainbox).release().perform();
		action.clickAndHold(Rome).moveToElement(mainbox).release().perform();
		action.clickAndHold(washingTon).moveToElement(mainbox).release().perform();
		action.clickAndHold(Madrid).moveToElement(mainbox).release().perform();

		
		
	//	action.dragAndDrop(norway, mainbox).perform();
	//	Thread.sleep(2000);
		
		
	//	action.dragAndDrop(norway, mainbox).perform();
	//	Thread.sleep(2000);
		
	//	action.dragAndDrop(sweden, mainbox).perform();
	//	Thread.sleep(2000);
		
	//	action.dragAndDrop(unitedStates, mainbox).perform();
	//	Thread.sleep(2000);
		
		
		//action.dragAndDrop(Denmark, mainbox).perform();
		//Thread.sleep(2000);
		
	//	action.dragAndDrop(southKorea, mainbox).perform();
	//	Thread.sleep(2000);
		
	//	action.dragAndDrop(Italy, mainbox).perform();
	//	Thread.sleep(2000);
		
	//	action.dragAndDrop(Spain, mainbox).perform();
	//	Thread.sleep(2000);
		
}
}