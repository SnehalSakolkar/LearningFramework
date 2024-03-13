package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {
	
	public static void main(String []args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ashishkulkarni/Downloads/Example1.html");
		driver.findElement(By.cssSelector("input[data-attribute='value1']")).sendKeys("Snehu in Germany");
		
	}
		
}
