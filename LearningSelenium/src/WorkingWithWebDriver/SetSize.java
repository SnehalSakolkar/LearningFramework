package WorkingWithWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
	public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Dimension dimension=new Dimension(600,800);
		driver.manage().window().setSize(dimension);
		
	}
		

}
