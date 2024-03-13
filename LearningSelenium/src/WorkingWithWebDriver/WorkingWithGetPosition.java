package WorkingWithWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPosition {
	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Point position=driver.manage().window().getPosition();
		System.out.println(position);
		Thread.sleep(2000);
		
	}
	
		

}
