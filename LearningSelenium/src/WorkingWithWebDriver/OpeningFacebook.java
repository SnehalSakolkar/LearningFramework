package WorkingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningFacebook {
	
	public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://Facebook.com/");
		
	}
		

}
