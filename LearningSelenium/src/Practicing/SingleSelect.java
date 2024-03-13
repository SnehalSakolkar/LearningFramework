package Practicing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
	
		WebElement element =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select=new Select(element);
		
		List <WebElement> options=select.getOptions();
		
		for(WebElement option:options) {
			System.out.println(option.getText());
			
			
			
		}
		
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByValue("AED");
		Thread.sleep(1000);
		select.selectByVisibleText("USD");
		
	}
}
