package WorkingWithWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {
	
	public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Dimension size=driver.manage().window().getSize();
		
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("The Height and Width is");
		
		
		
	}
		

}
