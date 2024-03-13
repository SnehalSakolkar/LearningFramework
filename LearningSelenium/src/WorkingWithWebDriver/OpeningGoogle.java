package WorkingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningGoogle {
	
	public static void main(String []args) {
		
	//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   // System.setProperty("webdriver.chrome.driver","/Users/ashishkulkarni/Downloads/chromedriver-mac-x64 2/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
		

}
