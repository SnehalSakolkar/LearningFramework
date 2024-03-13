package Practicing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllTheOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.id("multiselect1"));
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(WebElement option:options) {
			select.selectByVisibleText(option.getText());
		}
		
		//to deselect the value
		for(WebElement option:options) {
			select.deselectByVisibleText(option.getText());
			Thread.sleep(1000);
		}
	}

}
