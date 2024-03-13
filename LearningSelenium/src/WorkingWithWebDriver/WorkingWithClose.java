package WorkingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClose {
	
	public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.close();
	}
		

}
