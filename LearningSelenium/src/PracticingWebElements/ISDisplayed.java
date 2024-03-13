package PracticingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDisplayed {
	
public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		boolean result=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
         Thread.sleep(3000);
		System.out.println(result);
		driver.quit();
}
}
