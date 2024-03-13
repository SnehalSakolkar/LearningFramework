package PracticingSeleniumwithJavaScript;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLoginTab {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='header-links']//ul//li//a"));
		
		for(WebElement tab:tabs) {
			tab.sendKeys(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(1000);
		}
		Set<String> windowsId = driver.getWindowHandles();
		
		for(String windowId:windowsId) {
			
			if(driver.switchTo().window(windowId).getTitle().contains("Login")) {
				driver.switchTo().window(windowId);
				break;
			}
		}
		driver.findElement(By.id("Email")).sendKeys("snehalsakolkar9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		
}
	

}
