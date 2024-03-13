package WorkingWithTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpeningFirefox {
	
	@Test
	public void launchingFirefox() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}

}
